// Evaluation of a prefix expression.       // First go through the postfix evaluation.
// Operands must be integers and there should be a delimiter of any symbol except numbers or operators below (use space or comma for better readability).
// Expression must be correct (prefix) and operators must be '+', '-', '*' '/' or '%'.

package DataStructures.Stack.Questions;

import java.util.Scanner;
import java.util.Stack;

class PrefixEvaluation {

    public static void main(String[] args) {
        System.out.println("Enter a prefix expression: ");
        Scanner scan = new Scanner(System.in);
        String expression = scan.nextLine();
        int result = evaluatePrefix(expression);
        System.out.println(result);
    }

    public static int evaluatePrefix(String exp) {
        Stack<Integer> st = new Stack<>();
        for (int i=exp.length()-1;i>=0;i--){                                            // Parse the string starting from its end till its beginning.
            if (isOperator(exp.charAt(i))){                                             // If the character is an operator, pop two elements from stack, perform operation and push the result back.
                int op1 = st.peek(); st.pop();                                          // Pop two operands.
                int op2 = st.peek(); st.pop();
                int result = performOperation(exp.charAt(i), op1, op2);                 // Calculate the result
                st.push(result);                                                        // And push back the result to the stack.
            }
            else if (isNumericDigit(exp.charAt(i))) {
                int operand = 0, j=0;
                while(i>=0 && isNumericDigit(exp.charAt(i))){                           // Extract the numeric operand from the string and keep decrementing 'i' as long as you are getting a numeric digit.
                    operand = (exp.charAt(i)*(int)Math.pow(10,j) - '0'*(int)Math.pow(10,j)) + operand;          // string.charAt(i) just before/after any operator will always give the ASCII value only. So need to be careful when using it and write instruction appropriately/accordingly.
                    i--; j++;                                                           // i-- will also take care for the delimiters as well, since for loop will decrement 'i' one more time.
                }
                st.push(operand);                                                       // Pushing operand on the stack.
            }
        }
        return st.peek();                                                               // return the top element which will be the result.
    }

    public static boolean isOperator(char Ch) {
        if (Ch == '+' || Ch == '-' || Ch == '*' || Ch == '/' || Ch == '%' )
            return  true;
        return false;
    }

    public static int performOperation(char operator, int op1, int op2) {
        if (operator == '+')
            return op1 + op2;
        else if (operator == '-')
            return op1 - op2;
        else if (operator == '*')
            return op1 * op2;
        else if (operator == '/')
            return op1 / op2;
        else if (operator == '%')
            return op1 % op2;
        else
            System.out.println("Invalid operator used!!");
        return -1;
    }

    public static boolean isNumericDigit(char Ch) {
        if (Ch >= '0' && Ch <= '9')
            return true;
        return false;
    }

}

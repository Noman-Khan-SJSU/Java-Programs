// Evaluation of a postfix expression.
// Operands must be integers and there should be a delimiter of any symbol except a number or operators below (use space or comma for better readability).
// Expression must be correct (postfix) and operators must be '+', '-', '*' '/' or '%'.

package DataStructures.Stack.Questions;

import java.util.Scanner;
import java.util.Stack;

class PostfixEvaluation {

    public static void main(String[] args) {
        System.out.println("Enter a postfix expression: ");
        Scanner scan = new Scanner(System.in);
        String expression = scan.nextLine();
        int result = evaluatePostfix(expression);
        System.out.println(result);
    }

    public static int evaluatePostfix(String exp) {
        Stack<Integer> s = new Stack<>();
        for (int i=0;i<exp.length();i++){
             if (isOperator(exp.charAt(i))){                                // If the character is an operator, pop two elements from stack, perform operation and push the result back.
                int op2 = s.peek(); s.pop();                                // Pop two operands.
                int op1 = s.peek(); s.pop();
                int result = performOperation(exp.charAt(i), op1, op2);     // Calculate the result
                s.push(result);                                             // And push back the result to the stack.
             }
            else if (isNumericDigit(exp.charAt(i))) {
                int operand=0;
                while(i<exp.length() && isNumericDigit(exp.charAt(i))){     // Extract the numeric operand from the string and keep incrementing 'i' as long as you are getting a numeric digit.
                    operand = (operand*10) + (exp.charAt(i) - '0');         // [exp.charAt(i) - '0'] returns ASCII value of the character 'minus' ASCII value of '0' whereas [exp.charAt(i)] returns value of the character and [exp.charAt(i) - 0] returns ASCII value of 'i' minus (or any other operator) 0. First expression is to be used in this line since, since its value is stored in an int variable (operand). Second expression would store the ASCII value of the character, in the operand variable since it is an int.
                    i++;                                                    // This incrementation will also take care for the delimiters as well, since for loop will increment 'i' one more time.
                }
                s.push(operand);                                            // Pushing operand on the stack.
            }
        }
        return s.peek();                                                    // return the top element which will be the result.
    }

    public static boolean isOperator(char C) {
        if (C == '+' || C == '-' || C == '*' || C == '/' || C == '%' )
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
            System.out.println("Invalid operator used!");
        return -1;
    }

    public static boolean isNumericDigit(char C) {
        if (C >= '0' && C <= '9')
            return true;
        return false;
    }

}

// Conversion of Infix expression to Postfix expression.
// Operands must be integers and there should be a delimiter of any symbol except a number or operators below (use space or comma for better readability).
// Expression must be correct (infix) and operators must be '+', '-', '*' '/' or '%'.

package DataStructures.Stack.Questions;

import java.util.Scanner;
import java.util.Stack;

class InfixToPostfix {

    public static void main(String[] args) {
        System.out.println("Enter a Infix expression: ");
        Scanner scan = new Scanner(System.in);
        String expression = scan.nextLine();
        String postfix = infixToPostfix(expression);
        System.out.println(postfix);
    }

    public static String infixToPostfix(String exp) {
        Stack<Character> s = new Stack<>();
        String postfix = "";                                                // Initialize postfix as empty string.
        for (int i=0;i<exp.length();i++){                                   // Scanning each character from left to right.
            if (isOperator(exp.charAt(i))){                                 // If the character is an operator, pop two elements from stack, perform operation and push the result back.
                while (!s.empty() && s.peek() != '(' && hasHigherPrecedence(s.peek(), exp.charAt(i))){
                    postfix += s.peek(); s.pop();
                }
                s.push(exp.charAt(i));
            }
            else if (isOperand(exp.charAt(i))) {
                postfix += exp.charAt(i);
            }
            else if (exp.charAt(i) == '('){
                s.push(exp.charAt(i));
            }
            else if (exp.charAt(i) == ')'){
                while (!s.empty() && s.peek() != '('){
                    postfix += s.peek(); s.pop();
                }
                s.pop();
            }
        }
        while (!s.empty()){
            postfix += s.peek(); s.pop();
        }
        return postfix;                                                     // return the postfix string which will be the result.
    }

    public static boolean isOperator(char C) {
        if (C == '+' || C == '-' || C == '*' || C == '/' || C == '%' )
            return  true;
        return false;
    }

    public static boolean isOperand(char C){                                // This solution is for single character operands only.
        if (C >= '0' && C<='9' || C >= 'a' && C<='z' || C >= 'A' && C<='Z')
            return true;
        return false;
    }

    public static boolean hasHigherPrecedence(char op1, char op2){
        int op1Weight = getOperatorWeight(op1);
        int op2Weight = getOperatorWeight(op2);
        if (op1Weight == op2Weight){
            return true;
        }
        return op1Weight>op2Weight? true : false;
    }

    public static int getOperatorWeight(char op){
        int weight = -1;
        switch (op)
        {
            case '+':
            case '-':
                weight = 1;
                break;
            case '*':
            case '/':
            case '%':
                weight = 2;
        }
        return weight;
    }

}
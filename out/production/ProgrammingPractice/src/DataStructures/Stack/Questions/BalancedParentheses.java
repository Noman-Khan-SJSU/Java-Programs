// Check if the parentheses i.e. () (including {} and []) are balanced in an equation stored in a string.

package DataStructures.Stack.Questions;

import java.util.Scanner;
import java.util.Stack;

class BalancedParentheses {
    public static void main(String[] args) {
        System.out.println("Enter an expression having parentheses: ");
        Scanner scan = new Scanner(System.in);
        String expression = scan.nextLine();
        if (checkBalancedParentheses(expression))
            System.out.println("Expression is balanced!");
        else
            System.out.println("Not Balanced!");
    }

    public static boolean checkBalancedParentheses(String exp) {        // CIQ                 // Logic is: Last (most recent) unclosed bracket (on top of stack), should be closed first
        Stack<Character> s = new Stack<>();                                                    // i.e. the first (most recent) closure bracket should be for the last (most recent) unclosed bracket.
        for (int i = 0; i < exp.length(); i++) {
            if (exp.charAt(i) == '[' || exp.charAt(i) == '{' || exp.charAt(i) == '(') {        // Push all openings brackets on to the stack.
                s.push(exp.charAt(i));
            } else if (exp.charAt(i) == ']' || exp.charAt(i) == '}' || exp.charAt(i) == ')') {
                if (s.empty() || !checkPair(s.peek(), exp.charAt(i)))                          // If closing bracket doesn't match with the top of the stack or the list (stack) is empty, then expression is not balanced.
                    return false;
                else
                    s.pop();                                                                   // Otherwise, pop the top element and repeat the process until the stack is empty.
            }
        }
        return s.empty();                                                                      // If stack is not empty (might have opening bracket(s)), then expression is not balanced.
    }

    public static boolean checkPair(char opening, char closing) {
        if (opening == '[' && closing == ']' || opening == '{' && closing == '}' || opening == '(' && closing == ')')
            return true;
        return false;
    }

}
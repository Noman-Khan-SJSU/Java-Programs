// Reversing a string using stack.
// Time and Space Complexity: O(n).

package DataStructures.Stack.Questions;

import java.util.Scanner;
import java.util.Stack;

class ReverseAString
{
    public static void main(String[] args)
    {
        System.out.println("Enter a String: ");
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        String reverse = ReverseString(input);
        System.out.println(reverse);
    }

    public static String ReverseString(String input)
    {
        char[] array = input.toCharArray();                  // Converting the input string to a character array.
        Stack<Character> stack = new Stack<>();
        for (int i=0; i<array.length;i++)                    // Loop for push
        {
            stack.push(array[i]);
        }
        for (int i=0; i<array.length; i++)                   // Loop for pop
        {
            array[i] = stack.peek();                         // Overwrite the character at index i.  // Peek() method returns the top element.
            stack.pop();
        }
        String reverse = new String(array);                  // Converting character array back to a string.
        return reverse;
    }

}
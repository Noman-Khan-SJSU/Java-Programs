// Reverse a string.
// Time: O(n). Space: O(1).

package DataStructures.String;

import java.util.Scanner;

class ReverseAString
{
    public static void main(String[] args)
    {
        System.out.println("Enter the String: ");
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();                     // String in Java is immutable i.e. can't be changed/edited once created.
        String reverse = ReverseString(input);              // That is why a new string is created.
        System.out.println(reverse);
    }

    public static String ReverseString(String input)        // CIQ
    {
        char[] array = input.toCharArray();                 // Converting the input string to a character array.
        int i=0, j=array.length-1;                          // Pointing one index at the start and other at the end.
        while(i<j)
        {
            char temp = array[i];                           // Swapping characters at index i and j.
            array[i++] = array[j];                          // And then incrementing i and decrementing j.
            array[j--] = temp;
        }
        String reverse = new String(array);                 // Converting character array back to a string.
        return reverse;
    }

}
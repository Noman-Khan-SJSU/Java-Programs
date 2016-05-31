package ToBeOrganized;

import java.util.Scanner;

class ExceptionHandling                              // Exception handling is a way to handle unwanted problems so that they do not stop the normal execution of the program abruptly.
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        boolean b = true;                                                       // Setting flag for do-while loop.

        do {
            try {                                                               // Try to execute the lines in this block, if there's any problem then run the lines in the catch block and move on. Otherwise, don't run the catch block and move on.
                System.out.println("Enter the first number: ");
                int n1 = input.nextInt();
                System.out.println("Enter the second number:");
                int n2 = input.nextInt();
                int result = n1 / n2;                                           // This is where the exception will occur if applicable (if n2==0).
                System.out.println(n1 + " divided by " + n2 + " is " + result);
                b = false;                                                      // If there's no exception condition , all the lines in try block will execute successfully and then b will be set to false and control will come out of the do-while loop.
            } catch (Exception e) {                                             // If an exception is caught, the lines within the catch/finally block are executed. And after that, all the lines after these blocks will execute. But in case, exception isn't handled by the programmer, then the whole program will stop abruptly, the moment exception is met.
                System.out.println("You can't divide any number by 0");
                //System.out.println(e);                                        // If you want to see which exception was caught.
            }
        } while(b);
    }

}
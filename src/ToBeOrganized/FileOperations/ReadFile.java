package ToBeOrganized.FileOperations;

import java.io.*;
import java.util.*;

class ReadFile
{
    private Scanner x;                  // Scanner is not only used to read input from the keyboard, but from the files as well.

    public void openFile()
    {
        try {
            x = new Scanner(new File("C:\\Nomaan\\Demo.txt"));
        }
        catch (Exception e) {
            System.out.println("Could not find file!");
        }
    }

    public void readFile()
    {
        while(x.hasNext())              // Built-in method which runs till it reaches the end of the file.
        {
            String a = x.next();
            String b = x.next();
            String c = x.next();

            System.out.printf("%s %s %s\n", a,b,c);
        }
    }

    public void closeFile()
    {
        x.close();                      // Closing a file is a good practice.
    }

}

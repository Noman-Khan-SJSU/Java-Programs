package ToBeOrganized.FileOperations;

import java.util.*;

class CreateAFile
{
    public static void main(String[] args)
    {
        final Formatter x;              // A formatter variable outputs strings to a file. Like printf, instead of printing to the screen, it prints to the file i.e. writing into the file.

        try
        {
            x = new Formatter("C:\\Nomaan\\TestFil.txt");
            System.out.println("File has been created");
        }
        catch (Exception e)
        {
            System.out.println("There was a problem. File wasn't created!");
        }
    }

}
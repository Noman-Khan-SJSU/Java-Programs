package ToBeOrganized.FileOperations;

import java.util.*;
import java.lang.*;

class CreatingAFile
{
    private Formatter x;                      // This will hold a Formatter object.

    public void openFile()
    {
        try{
            x = new Formatter("C:\\Nomaan\\NewFile.txt");               // If the file isn't present already, it will create a new one.
        }
        catch (Exception e) {
            System.out.println("A problem occurred. File could not be opened");
        }
    }

    public void addRecords()
    {
        x.format("%s%s%s","20 ", "bucky ", "roberts");
    }

    public void closeFile()
    {
        x.close();
    }

}
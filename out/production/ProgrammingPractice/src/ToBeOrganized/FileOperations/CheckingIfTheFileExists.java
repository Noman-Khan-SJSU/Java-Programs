package ToBeOrganized.FileOperations;

import java.io.File;        // File class gives info like whether the file exists, lenghth, path. It doesn't create files.

class CheckingIfTheFileExists
{
    public static void main(String[] args)
    {
        File x = new File("C:\\Nomaan\\Demo.txt");              // Creates an object of File type by passing the path of the file in the constructor and assign(es) it to x.

        if (x.exists())                                         //
            System.out.println(x.getName() + " exists");
        else
            System.out.println("File doesn't exists!");
    }

}

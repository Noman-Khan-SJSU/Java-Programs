package ToBeOrganized.FileOperations;

class ReadFileMain
{
    public static void main(String[] args)
    {
        ReadFile r = new ReadFile();
        r.openFile();
        r.readFile();
        r.closeFile();
    }

}
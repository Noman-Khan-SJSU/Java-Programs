package ToBeOrganized.FileOperations;

class CreatingAFileMain
{
    public static void main(String[] args)
    {
        CreatingAFile file = new CreatingAFile();
        file.openFile();
        file.addRecords();
        file.closeFile();
    }
}

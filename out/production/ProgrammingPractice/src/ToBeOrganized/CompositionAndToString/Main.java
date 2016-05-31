package ToBeOrganized.CompositionAndToString;

class Main
{
    public static void main(String[] args)
    {
        Date date = new Date(01,01,2000);
        Person person = new Person("John", date);

        System.out.println(person);

    }
}

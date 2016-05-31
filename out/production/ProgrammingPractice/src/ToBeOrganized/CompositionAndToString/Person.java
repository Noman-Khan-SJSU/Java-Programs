package ToBeOrganized.CompositionAndToString;

class Person
{
    private String name;
    private Date dateOfBirth;                   // Other than instance variables and methods, classes can have references to objects of other classes. (Composition)

    public Person(String name, Date theDate)
    {
        this.name = name;
        dateOfBirth = theDate;
    }

    public String toString()                    // toString is the method which allows us to represent the object in the string format. This will represent the Person object.
    {
        return String.format("My name is %s and my date of birth is %s", name, dateOfBirth);
    }

}
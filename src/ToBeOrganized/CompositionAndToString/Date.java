package ToBeOrganized.CompositionAndToString;

class Date
{
    private int month;
    private int day;
    private int year;

    public Date(int m, int d, int y)
    {
        month = m;
        day = d;
        year = y;

        System.out.printf("The constructor for this is %s\n", this);    // "this" refers to the current object (the object that was just constructed). Anytime an object is referenced in the string format, it looks for the toString() method.
    }

    public String toString()                                            // toString is the method which allows us to represent the object in the string format. This will represent the Date object.
    {
        return String.format("%d/%d/%d",month,day,year);
    }

}
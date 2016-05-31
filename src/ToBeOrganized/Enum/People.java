package ToBeOrganized.Enum;

public enum People                      // Enumerations (enums) are like classes and used to declare constants.
{
    bucky("nice", "22"),                // Constants/enums (similar to objects)
    John("good", "20"),                 // Constants/enums (similar to objects)
    Michael("great", "25"),
    David("awesome", "21"),
    Katie("decent", "23"),
    Emilia("intelligent", "25");

    private final String desc;          // e.g. nice, good
    private final String year;          // e.g. 22, 20

    People(String description, String birthday)
    {
        desc = description;
        year = birthday;
    }

    public String getDesc(){
        return desc;
    }

    public String getYear(){
        return year;
    }

}
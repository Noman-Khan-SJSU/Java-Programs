package ToBeOrganized.Enum;

import java.util.EnumSet;

public class Main
{
    public static void main(String[] args)
    {
        for (People person : People.values())           // EnumName.values() is an array of the constants in the enum.
        {
            System.out.printf("%s\t%s\t%s\n", person, person.getDesc(), person.getYear());
        }

        System.out.println("\n And now for the range of constants!!! \n");

        for (People person: EnumSet.range(People.John,People.Katie))        // To get a specific set/range of the default array of enum.  // Import java.util.EnumSet.
        {
            System.out.printf("%s\t%s\t%s\n", person, person.getDesc(), person.getYear());
        }

    }

}
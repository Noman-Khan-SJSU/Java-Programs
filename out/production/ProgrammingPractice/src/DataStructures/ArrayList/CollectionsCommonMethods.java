package DataStructures.ArrayList;

import java.util.*;

class CollectionsCommonMethods {

    public static void main(String[] args) {

        String[] strArray = {"apples" , "lemons" , "geese" , "chicken" , "youtube"};

        List<String> list = Arrays.asList(strArray);            // Converts the array to a List.

        Collections.sort(list);                                 // Sorts the list in increasing order.

        System.out.println(list);                               // Prints the list

        Collections.reverse(list);                              // Reverses the list.

        Collections.sort(list, Collections.reverseOrder());     // Sorts the list in reverse order.

        System.out.println(list);

        // Create a new array and a new list
        String[] newArray = new String[strArray.length];        // Empty array of size 5
        List<String> listCopy = Arrays.asList(newArray);        // Empty list of size 5

        // Copy contents of list into listCopy
        Collections.copy(listCopy,list);

        System.out.println(listCopy);

        // Fill collection with some specific data
        Collections.fill(listCopy,"Yo!");
        System.out.println(listCopy);

        List<String> newList = new ArrayList<>();

        // Add all elements from one list to another
        Collections.addAll(newList, strArray);
        Collections.addAll(newList, "Yo", "Yo");

        System.out.println(newList);

        System.out.println(Collections.frequency(newList, "Yo"));       // Gives the frequency of the element in the list.

        System.out.println(Collections.disjoint(newList,listCopy));     // Tells whether the two collections are disjoint or not (having something in common or not)

    }

}
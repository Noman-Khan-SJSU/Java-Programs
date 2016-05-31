package DataStructures.LinkedList.Singly;

import java.util.*;

class ConvertListAndArray {

    public static void main(String[] args) {

        String[] array = {"one", "two", "three", "four"};

        //Converting an array to a List
        LinkedList<String> list = new LinkedList<>(Arrays.asList(array));

        //Using some of the List methods
        list.add("five");
        list.addFirst("zero");

        System.out.println("Printing the list: ");
        for (int i=0; i<list.size();i++){
            System.out.printf("%s ", list.get(i));
        }

        //Converting the list back to an array
        array = list.toArray(new String[list.size()]);

        System.out.println("\nPrinting the the array: ");
                for (String x: array)
            System.out.printf("%s ", x);

    }
}

//Converting an Array to a List and vice versa.

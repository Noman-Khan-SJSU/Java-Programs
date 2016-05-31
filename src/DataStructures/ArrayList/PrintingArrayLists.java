package DataStructures.ArrayList;

import java.util.*;

class PrintingArrayLists {

    public static void main(String[] args) {

        String[] s1 = {"water", "medicines", "laptop", "cellphone"};
        String[] s2 = {"almonds", "cookies", "chocolates"};

        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();

        for (int i=0; i<s1.length;i++){
            list1.add(s1[i]);
        }
        for (int i=0; i<s2.length;i++){
            list2.add(s2[i]);
        }

        System.out.println("List 1 elements are: ");
        for (int i=0; i<list1.size();i++){
            System.out.print(list1.get(i) + " ");
        }
        System.out.println("\nList 2 elements are: ");
        for (int i=0; i<list2.size();i++){
            System.out.printf("%s ", list2.get(i));
        }
    }

}

//Printing elements of newly created ArrayList of type, String.
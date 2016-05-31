package DataStructures.LinkedList.Singly;

import java.util.*;

class ReverseLinkedList {

    public static void main(String[] args) {

        String[] s1 = {"almonds", "cookies", "laptop", "cellphone"};
        String[] s2 = {"almonds", "chocolates", "cellphone"};

        List<String> list1 = new LinkedList<>();
        List<String> list2 = new LinkedList<>();

        //adds1ToList1
        for (int i=0; i<s1.length;i++)
            list1.add(s1[i]);

        //adds2ToList2
        for (int i=0; i<s2.length;i++)
            list2.add(s2[i]);

        printList(list1);
        list1.addAll(list2);
        printList(list1);
        list2 = null;               //no need of list2 anymore
        removeNodes(list1, 2, 5);
        printList(list1);
        reverseList(list1);
    }

    public static void printList(List<String> l){

        for (int i=0; i<l.size();i++)
            System.out.printf("%s ", l.get(i));
        System.out.println();
    }

    public static void removeNodes(List<String> l, int to, int from){

        l.subList(to,from).clear();
    }

    public static void reverseList(List<String> l){

        ListIterator<String> lit = l.listIterator(l.size());
        while(lit.hasPrevious()){
            System.out.printf("%s ", lit.previous());
        }
    }
}

//Reversing, printing and removing nodes of/from a LinkedList.

package DataStructures.ArrayList;

import java.util.*;

class UsingIteratorOnArrayList {

    public static void main(String[] args) {

        String[] s1 = {"almonds", "cookies", "laptop", "cellphone"};
        String[] s2 = {"almonds", "chocolates", "cellphone"};

        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();

        for (int i=0; i<s1.length;i++)
            list1.add(s1[i]);

        for (int i=0; i<s2.length;i++)
            list2.add(s2[i]);

        System.out.println("List 1 elements are: ");
        for (int i=0; i<list1.size();i++)
            System.out.printf("%s ", list1.get(i));

        System.out.println("\nList 2 elements are: ");
        for (int i=0; i<list2.size();i++)
            System.out.printf("%s ", list2.get(i));

        removeDuplicates(list1, list2);
        System.out.println("\nList 1 elements are: ");
        for (int i=0; i<list1.size();i++)
            System.out.printf("%s ", list1.get(i));
    }

    public static void removeDuplicates(Collection<String> l1, Collection<String> l2){          // Collection<String> is a better parameter than a List<String> for polymorphism.
        Iterator<String> it = l1.iterator();
        while(it.hasNext()){
            if (l2.contains(it.next()))
                it.remove();
        }
    }

}

//Using Iterator on ArrayList to remove duplicate elements
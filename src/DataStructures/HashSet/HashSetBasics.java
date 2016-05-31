package DataStructures.HashSet;

import java.util.*;

class HashSetBasics
{
    public static void main(String[] args)
    {
        String[] fruits = {"apple", "mango", "banana", "mango", "pineapple"};

        List<String> list = Arrays.asList(fruits);

        System.out.println(list);

        Set<String> set = new LinkedHashSet<>(list);

        System.out.println(set);
    }

}
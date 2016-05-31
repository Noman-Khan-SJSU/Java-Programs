/*
Write a method that returns the number of distinct pairs of integers from an array of
unique integers that sum to a target value. The input to the method countPairs of class
Pairs consists of an array of unique integers and the target value.

For example, with array [10,2,3,4,5,6,7,8,9,1] and a targetValue 7, there are three distinct
pairs of integers tat sum to 7, which are {1,6}, {2,5} and {3,4}. The pairs {1,6} and {6,1}
are not distinct from each other, so they should be counted as a single distinct pair.
*/

package DataStructures.Hashmap;

import java.util.HashMap;

class CountPairs {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7};
        int target = 7;
        int pairs = countPairs(arr, target);
        System.out.println("Number of distinct pairs are: " + pairs);
    }

    public static int countPairs(int[] array, int targetValue){

        HashMap<Integer, Integer> map = new HashMap<>();
        int result=0;
        for (int i=0; i<array.length; i++) {
            int x = targetValue - array[i];
            if (map.containsKey(x))
                result++;
            else
                map.put(array[i], i);
        }
        return result;
    }

}
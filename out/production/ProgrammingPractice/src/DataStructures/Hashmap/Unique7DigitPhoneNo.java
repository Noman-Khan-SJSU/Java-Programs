// You have a telephone with numbers placed as usual in the dial pad. You need to calculate how many unique 7-digit
// phone numbers are possible to dial, starting from digit 1 only. Every next number that could be dialed will be
// in the position as a knight moves, in the game of chess. E.g After 1, 6 and 8 can be dialed, After 6 -> 1,7 and 0
// could be dialed and so on.

package DataStructures.Hashmap;

import java.util.*;

class Unique7DigitPhoneNo {

    public static Map<Integer,List<Integer>> map = new HashMap<>();     // Create a map where key will be the number and the value will be the list of numbers that could be dialed after the key number.

    public static void main(String[] args) {

        map.put(1,new ArrayList<>(Arrays.asList(6,8)));
        map.put(2,new ArrayList<>(Arrays.asList(7,9)));
        map.put(3,new ArrayList<>(Arrays.asList(4,8)));
        map.put(4,new ArrayList<>(Arrays.asList(3,9,0)));
        map.put(6,new ArrayList<>(Arrays.asList(1,7,0)));
        map.put(7,new ArrayList<>(Arrays.asList(2,6)));
        map.put(8,new ArrayList<>(Arrays.asList(1,3)));
        map.put(9,new ArrayList<>(Arrays.asList(2,4)));
        map.put(0,new ArrayList<>(Arrays.asList(4,6)));

        System.out.println(uniquePhoneNumbers(1,6));

    }

    public static int uniquePhoneNumbers(int currentPosition, int depth) {      // Visualize a tree structure for this problem, you just need to calculate the total no. of leaf nodes or paths from the root node (1), recursively.

        if (depth == 0)
            return 1;
        int result = 0;
        for (Integer i: map.get(currentPosition))
        {
            result += uniquePhoneNumbers(i,depth-1);
        }
        return result;
    }

}
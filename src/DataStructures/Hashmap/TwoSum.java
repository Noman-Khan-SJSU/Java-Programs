/*
Given an array of integers, find two numbers such that they add up to a specific target number.
The function twoSum should return indices of the two numbers such that they add up to the target,
where index1 must be less than index2. Please note that your returned answers (both index1 and index2)
are not zero-based. You may assume that each input would have exactly one solution.

E.g.
Input: numbers={2, 7, 11, 15}, target=9
Output: index1=1, index2=2
*/

// Time : O(n). Space: O(n).   // Could also be done in O(n^2) time and O(1) space.

package DataStructures.Hashmap;

import java.util.HashMap;

class TwoSum {

    public static void main(String[] args) {

        int[] numbers = {2, 7, 5, 6, 3,1};
        int target = 10;
        int[] indices = twoSum(numbers, target);
        System.out.println("Indices of the two numbers are: " + indices[0] + " and " + indices[1] );
    }

    public static int[] twoSum(int[] numbers, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            int value = target - numbers[i];
            if (map.containsKey(value)) {
                return new int[]{map.get(value) + 1, i + 1};
            }
            map.put(numbers[i], i);
        }
        throw new IllegalArgumentException("Illegal Argument");
    }

}
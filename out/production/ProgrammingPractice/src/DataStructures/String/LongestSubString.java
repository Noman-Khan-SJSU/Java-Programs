// Longest Substring without repeating characters.
// Time: n . Space: n.

package DataStructures.String;

import java.util.HashSet;

class LongestSubString {

    public static void main(String[] args) {

        String s = "ababcab";
        System.out.println(lengthOfLongestSubstring(s));
    }


    public static int lengthOfLongestSubstring(String s) {
        if(s==null || s.length() == 0)
            return 0;

        char[] arr = s.toCharArray();
        int max = 0;

        HashSet<Character> set = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            if (!set.contains(arr[i]))
                set.add(arr[i]);
            else {
                max = Math.max(max, set.size());
                set.clear();
            }
        }
        return Math.max(max, set.size());
    }

//    public static int lengthOfLongestSubstring(String s) {        // ( LT - 10 )
//
//        boolean[] exist = new boolean[256];
//        int i = 0, maxLen = 0;
//        for (int j = 0; j < s.length(); j++) {
//            while (exist[s.charAt(j)]) {
//                exist[s.charAt(i)] = false;
//                i++;
//            }
//            exist[s.charAt(j)] = true;
//            maxLen = Math.max(j - i + 1, maxLen);
//        }
//        return maxLen;
//    }

}
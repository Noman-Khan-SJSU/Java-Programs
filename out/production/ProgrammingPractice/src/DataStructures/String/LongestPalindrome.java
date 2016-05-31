// Time : n^2. Space: 1.

package DataStructures.String;

class LongestPalindrome {

    public static void main(String[] args) {

        String s = "whichracecardoyouhave?";
        String palindrome = getLongestPalindrome(s);
        System.out.println("Longest Palindrome is : " + palindrome);
    }

    public static String getLongestPalindrome(String s) {

        if (s.isEmpty())
            return "No Palindrome";
        if (s.length() == 1)
            return s;

        String longest = s.substring(0,1);

        for (int i=0; i < s.length(); i ++) {
            String temp = checkPalindrome(s,i,i);
            if (temp.length() > longest.length())
                longest = temp;
            temp = checkPalindrome(s,i,i+1);
            if (temp.length() > longest.length())
                longest = temp;
        }
        return longest;
    }

    public static String checkPalindrome(String s, int start, int end) {
        while ( start >= 0 && end<s.length() && s.charAt(start) == s.charAt(end) ) {
            start--;
            end++;
        }
        return s.substring(start+1,end);
    }
}
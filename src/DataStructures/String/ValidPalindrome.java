//Given a string, determine if it is a palindrome, considering, only alphanumeric characters and ignoring cases.
// Time : n. Space: 1.

package DataStructures.String;

class ValidPalindrome {

    public static void main(String[] args) {

        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }

    public static boolean isPalindrome(String s) {

        int i = 0, j = s.length() - 1;

        while ( i < j ) {
            while ( i < j && !Character.isLetterOrDigit(s.charAt(i)))
                i++;
            while ( i < j && !Character.isLetterOrDigit(s.charAt(j)))
                j--;
            if (Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j)))
                return false;
            i++; j--;
        }
        return true;                    // Considering empty string to be a valid palindrome.
    }

}
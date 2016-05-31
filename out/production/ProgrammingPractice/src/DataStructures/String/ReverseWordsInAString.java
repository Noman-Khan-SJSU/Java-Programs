// Time : n. Space: n.

package DataStructures.String;

class ReverseWordsInAString {

    public static void main(String[] args) {

        String s = "the sky is blue";
        String reverse = reverseWords(s);
        System.out.println(reverse);
    }

    public static String reverseWords(String s) {

        String[] words = s.split(" ");
        StringBuilder reverse = new StringBuilder();
        for (int j=words.length-1; j>=0; j--) {
            reverse.append(words[j] + " ");
        }
        return reverse.toString().trim();
    }

}


// Alternate solution which is a little better. Above solution takes two passes where as below solution does it in one pass only. {LC - 6)
// Time : n. Space : n.


//    public static String reverseWords(String s) {
//
//        StringBuilder reversed = new StringBuilder();
//        int j = s.length();
//        for (int i = s.length() - 1; i >= 0; i--) {
//            if (s.charAt(i) == ' ')
//                j = i;
//            else if (i == 0 || s.charAt(i - 1) == ' ') {
//                if (reversed.length() != 0)
//                    reversed.append(' ');
//                reversed.append(s.substring(i, j));
//            }
//        }
//        return reversed.toString();
//    }
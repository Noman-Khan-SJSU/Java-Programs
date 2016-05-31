// Time : O(n) [ n is the length of the input string ]. Space: O(1).

package DataStructures.String;

 class UniqueCharacters {

     public static void main(String[] args) {

         String str = "newyork";
         System.out.println(isUnique(str));
     }

     public static boolean isUnique(String str) {   // CIQ

         if (str.length() > 256)                    // for ASCII String (not for Unicode sting)
             return false;

         boolean[] char_set = new boolean[256];
         for (int i=0; i<str.length(); i++) {

             int val = str.charAt(i);               // returns the ASCII value of the character at that position in the string.
             if (char_set[val])                     // If this character is already in the string
                 return false;
             char_set[val] = true;
         }
         return true;
     }

}

// Alternatively, compare every character of the string to every other character. O(n^2).
// Sort the string in (n log n) is it's allowed. and then linearly check the neighbouring characters.
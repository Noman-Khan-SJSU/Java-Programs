package DataStructures.String;

class Anagram {

    public static void main(String[] args) {

        String s1 = "cinema";
        String s2 = "iceman";
        System.out.println(isAnagram(s1,s2));
    }

    public static boolean isAnagram(String s1, String s2) {

        if (s1.length() != s2.length())
            return false;

        int[] letters = new int[256];               // Assuming string contains of ASCII characters only

        char[] s1_array = s1.toCharArray();
        for (char c : s1_array){
            letters[c]++;
        }

        for (int i=0; i<s2.length(); i++){
            int c = (int)s2.charAt(i);
            if (--letters[c] <0)
                return false;
        }
        return true;
    }

}
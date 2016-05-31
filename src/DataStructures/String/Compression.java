// Compress the input string in the form of the output. (1.5 CCI)

package DataStructures.String;

class Compression {

    public static void main(String[] args) {

        String str = "aabcccccaaa";
        String result = compression(str);
        System.out.println(result);
    }

    public static String compression(String str) {

        if (str == null || str.isEmpty())
            return "";
        StringBuilder result = new StringBuilder();
        char last = str.charAt(0);
        int count = 1;
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == last)
                count++;
            else {
                result.append(last + Integer.toString(count));
                last = str.charAt(i);
                count = 1;
            }
        }
        result.append(last + Integer.toString(count));
        return result.toString().length() < str.length() ? result.toString() : str;
    }

}
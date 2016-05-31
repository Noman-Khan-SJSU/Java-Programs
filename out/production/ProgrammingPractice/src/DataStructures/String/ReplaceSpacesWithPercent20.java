package DataStructures.String;

class ReplaceSpacesWithPercent20 {

    public static void main(String[] args) {

        String s = "Hello World!";
        String result = replaceSpaces(s);
        System.out.println(result);
    }

    public static String replaceSpaces(String s) {

        StringBuilder result = new StringBuilder();             // Dynamic Array of characters
        for (int i=0; i<s.length();i++) {
            if (s.charAt(i) == ' ')
                result.append("%20");
            else
                result.append(s.charAt(i));
        }
        return result.toString();
    }

}
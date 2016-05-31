// Check if the string is a panagram (return empty if it is), else return the missing characters in a string.

package DataStructures.String;

class Panagram {

    public static void main(String[] args) {

        String str = "A quick brown fox jumps over the lazy dog";
        System.out.println(getMissingLetters(str));
    }

    public static String getMissingLetters(String str) {

        StringBuilder alphabets = new StringBuilder("abcdefghijklmnopqrstuvwxyz");
        char [] strArray=str.toLowerCase().toCharArray();
        for(char c:strArray){
            int index=alphabets.indexOf(c+"");
            if(index!=-1){
                alphabets.deleteCharAt(index);
            }
        }
        return alphabets.toString();
    }

}
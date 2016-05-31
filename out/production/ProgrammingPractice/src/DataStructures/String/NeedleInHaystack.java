// Implementation of strStr() function.
// Returns the index of the first occurrence of needle in haystack or -1 if needle is not part of the haystack.
// Time : O(nm) (length of haystack * length of needle).

package DataStructures.String;

class NeedleInHaystack {

    public static void main(String[] args) {

        String haystack = "whattherockiscooking?";
        String needle = "therock";
        int index = strStr(haystack,needle);
        System.out.println("Position of needle in the haystack is at index: " + index);
    }

    public static int strStr(String haystack, String needle) {

        if( haystack==null || haystack.length()==0 || needle==null || needle.length()==0)
            return 0;

        for(int i=0; i<haystack.length(); i++){

            if(i + needle.length() > haystack.length())
                return -1;

            int m = i;

            for(int j=0; j<needle.length(); j++){
                if(needle.charAt(j) == haystack.charAt(m)){
                    if(j == needle.length() - 1 )
                        return i;
                    m++;
                }
                else
                    break;
            }
        }
        return -1;
    }

}
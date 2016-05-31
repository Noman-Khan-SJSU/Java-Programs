// Check if one string is a rotation of another.

package DataStructures.String;

class IsRotation {

    public static void main(String[] args) {

        String s1 = "WaterBottle";
        String s2 = "erBottleWat";
        System.out.println(isRotation(s1, s2));

    }

    public static boolean isRotation(String s1, String s2) {

        if (s1.length() == s2.length() && s1.length() > 0) {
            String s1s1 = s1 + s1;
            return s1s1.contains(s2);
        }
        return false;
    }

}
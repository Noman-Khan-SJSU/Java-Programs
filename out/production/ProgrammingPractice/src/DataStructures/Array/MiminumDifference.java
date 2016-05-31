// Find two elements in the array, whose difference is minimum.
// Time: O(n log n) because of the sort method.

package DataStructures.Array;

import java.util.Arrays;

class MiminumDifference {

    public static void main(String[] args) {
        int[] A = {7,15,50,9,11,3,20,13,49};
        int[] result = mindiff(A);
        System.out.println("Minimum difference is between: " + result[0] + " and " + result[1]);
    }

    public static int[] mindiff(int[] A) {
        Arrays.sort(A);
        int[] result = {A[1], A[0]};
        int prevDiff = A[1] - A[0];
        for (int i=2; i<A.length;i++){
            int currDiff = A[i] - A[i-1];
            if (currDiff < prevDiff) {
                result[0] = A[i];
                result[1] = A[i-1];
                prevDiff = currDiff;
            }
        }
        return result;
    }

}
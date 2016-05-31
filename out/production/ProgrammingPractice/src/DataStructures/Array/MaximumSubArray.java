// Find the sub-array in an array whose sum of elements is maximum.
// Time : O(n). Space : O(1).

package DataStructures.Array;

class MaximumSubArray {

    public static void main(String[] args) {

        int[] A = {1,-3,2,-5,7,6,-1,-4,11,-23};
        if (A.length == 0)
            System.out.println("Array is empty!");
        else
            System.out.println(maxSumSubArray(A));
    }

    public static int maxSumSubArray(int[] A) {             // CIQ

        if (A.length == 0)                                  // Case 1: If array is empty.
            return Integer.MIN_VALUE;
        int max = A[0];
        for (int i=1; i<A.length; i++)                      // Case 2: If all elements are negative.
            max = Math.max(max, A[i]);
        if (max < 0)
            return max;
        max = 0; int sum =0;                                // Case 3: Now at least one element will be positive or 0 in the array.
        for (int i=0; i < A.length; i++){
            if (sum + A[i] > 0)                             // Add all consecutive elements till their sum comes positive.
                sum += A[i];
            else
                sum = 0;                                    // Otherwise, discard previous sum and again start adding elements till their sum comes positive.
            max = Math.max(max,sum);                        // Every sum (or element) which is positive is saved as max if it is greater than previous maz (i.e. previous sum or element).
        }
        return max;
    }

}
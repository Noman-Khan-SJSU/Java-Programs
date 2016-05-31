package DataStructures.Array;

import java.util.Arrays;

class RemoveDuplicatesSorted2 {

    public static void main(String[] args) {

        int A[] = {-2,-1,-1,0,1, 1, 2, 3, 3, 3, 4, 5, 5, 6};
        A = removeDuplicates(A);
        System.out.println(Arrays.toString(A));

    }

    public static int[] removeDuplicates(int[] A) {

        if (A.length < 2)
            return A;
        int j = 0;
        int i = 1;
        while (i < A.length) {
            if (A[i] == A[j]) {
                i++;
            } else {
                j++;
                A[j] = A[i];
                i++;
            }
        }
        return Arrays.copyOf(A, j + 1);

    }
}

//Remove duplicates from a sorted array and return array with unique numbers.
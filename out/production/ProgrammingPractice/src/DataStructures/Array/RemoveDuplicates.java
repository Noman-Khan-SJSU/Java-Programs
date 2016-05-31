package DataStructures.Array;

import java.util.Arrays;
import java.util.HashSet;

class RemoveDuplicates {

    public static void main(String[] args) {

        int A[] = {5, 5, 3, 4, 4, 4, 2, 1, 1};
        int[] new_array = removeDuplicates(A);
        //Array.sort(new_array);
        System.out.println(Arrays.toString(new_array));

    }

    public static int[] removeDuplicates(int[] A) {

        HashSet<Integer> hset = new HashSet<>();
        int[] B = new int[A.length];
        int j=0;
        for (int i=0; i<A.length;i++) {
            if (!(hset.contains(A[i]))) {
                hset.add(A[i]);
                B[j] = A[i];
                j++;
            }
        }
        return Arrays.copyOf(B,j);

    }
}

//Remove duplicates from an unsorted/sorted array using HashSet.


/* Method to return number of unique elements.

    public static int removeDuplicates(int[] A) {

        HashSet<Integer> hset = new HashSet<>();
        for (int i = 0; i < A.length; i++) {
            hset.add(A[i]);
        }
        return hset.size();

    }
}
*/

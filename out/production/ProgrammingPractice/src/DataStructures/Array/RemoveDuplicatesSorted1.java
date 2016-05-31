package DataStructures.Array;

class RemoveDuplicatesSorted1 {

    public static void main(String[] args) {

        int A[] = {1, 1, 2, 3, 3, 3, 4, 5, 5, 6};
        int unique_elements = removeDuplicates(A);
        System.out.println(unique_elements);

    }

    public static int removeDuplicates(int[] A) {

        int count = 0;
        for (int i = 0; i < A.length - 1; i++) {
            if (A[i] == A[i + 1]) {
                count++;
            }
        }
        return (A.length - count);

    }
}

//Return the number of unique elements of an sorted array.
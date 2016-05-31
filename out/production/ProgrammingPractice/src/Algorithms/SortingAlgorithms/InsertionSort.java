// Sorting elements of an array using insertion sort.
// Inserting elements from the unsorted right part to the sorted left part, one at a time, in each pass, beginning from
// second element since the first element is always sorted. Unsorted element will be shifted to the left,
// until there is an element smaller than itself to its left or it reaches the index 0.
// Time: O(n^2). Space: 1. Stable. In-place. Internal. Non-recursive.
// Insertion sort is considered better than selection and bubble sort, since the number of comparisons and shifts in the former are a lot lesser in most practical scenarios.

package Algorithms.SortingAlgorithms;

import java.util.Arrays;

class InsertionSort
{
    public static void main(String[] args)
    {
        int A[] = {5,10,2,7,4,8,3,9,6,1};
        A = insertionSort(A);
        System.out.println(Arrays.toString(A));
    }

    public static int[] insertionSort(int[] A)
    {
        for (int i=1; i<A.length;i++)           // Loop begins from the second element since the first element is always sorted.
        {
            int value = A[i];                   // Saving the value of the element in a temporary variable.
            while (i>0 && value < A[i-1])       // Looping till all the previous elements are greater than the value.
            {                                   // Best case time complexity will be O(n) for sorted array.
                A[i] = A[i-1];                  // Right shift all the elements by 1 index, which are greater than the value.
                i--;                            // Decrement the index for the element to be placed at.
            }
            A[i] = value;                       // Assign the value of the element at the appropriate index.
        }
        return A;
    }
}
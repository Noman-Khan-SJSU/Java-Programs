// Sorting elements of an array in increasing order using selection sort.
// Selecting minimum element and then placing it at its appropriate position in each pass by swapping.
// Time: O(n^2). Space: constant i.e. 1. Unstable. In-place. Internal. Non-recursive.
// Unstable case: {4,2,5,4,1}.

package Algorithms.SortingAlgorithms;

import java.util.Arrays;

class SelectionSort
{
    public static void main(String[] args)
    {
        int A[] = {5,10,2,7,4,8,3,9,6,1};
        A = selectionSort(A);
        System.out.println(Arrays.toString(A));
    }

    public static int[] selectionSort(int[] A)
    {
        for (int i=0; i<A.length-1; i++)                // Looping till second last element is sufficient as the last element will be automatically sorted.
        {
            int iMin = i;                               // Initializing iMin (index of smallest element) so that swapping is done only once after every pass.
            for (int j=i+1; j<A.length;j++)             // Here, looping till the last element is necessary.
            {
                if (A[j] < A[iMin])
                    iMin = j;                           // Updating the value of iMin so that minimum element is selected after each pass.
            }
            int temp = A[i];                            // Swapping the minimum element with the i^th position.
            A[i] = A[iMin];
            A[iMin] = temp;
        }
        return A;                                       // return the sorted array.
    }
}
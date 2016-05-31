// Sorting elements of an array in increasing order using bubble sort.
// Comparing every pair of adjacent elements and swapping if previous element is greater than the next in each pass,
// so that the maximum element gets bubbled up at the last index, at the end of each pass.
// Time: O(n^2). Space: constant. Stable. In-place. Internal. Non-recursive.

package Algorithms.SortingAlgorithms;

import java.util.Arrays;

class BubbleSort
{
    public static void main(String[] args)
    {
        int A[] = {5,10,2,7,4,8,3,9,6,1};
        A = bubbleSort(A);
        System.out.println(Arrays.toString(A));

    }

    public static int[] bubbleSort(int[] A)
    {
        for (int i=0; i<A.length-1; i++)
        {
            boolean flag = true;                    // If elements are already sorted, then no need of further looping.
            for (int j=0; j<A.length-1-i;j++)       // No need to go till the last element(s) which are already sorted.
            {
                if(A[j] > A[j+1])                   // Checking if previous is greater than the next element.
                {
                    int temp = A[j];                // Swap if previous is greater than next.
                    A[j] = A[j+1];
                    A[j+1] = temp;
                    flag = false;                   // This means elements are not already sorted.
                }
            }
            if (flag)                               // This makes the best case time complexity: O(n), for sorted array.
                break;
        }
        return A;
    }
}

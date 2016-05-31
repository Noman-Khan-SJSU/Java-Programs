// Sorting elements of an array using merge sort. This is a "divide and conquer" algorithm. Divide and conquer uses recursion mostly.
// Dividing the input array into two new arrays recursively until there is only one element in each array i.e. each array is
// sorted. Then merge the sorted sub-arrays one by one into a sorted array, until the original input array is sorted.
// Time: O(n log n). Space: O(n). Stable. Not in-place i.e. Out of place.  Internal. Recursive.

package Algorithms.SortingAlgorithms;

import java.util.Arrays;

class MergeSort
{
    public static void main(String[] args)
    {
        int A[] = {5, 10, 2, 7, 4, 8, 3, 9, 6, 1};
        A = mergeSort(A);
        System.out.println(Arrays.toString(A));
    }

    public static int[] mergeSort(int[] A)
    {
        if (A.length == 1)                              // Base/exit condition for the recursion.
        {
            return A;
        }
        int mid = A.length / 2;
        int[] left = new int[mid];                      // Half the elements of the original array will go into left.
        int[] right = new int[A.length - mid];          // Rest of the elements will go the the right array.
        for (int i = 0; i < mid; i++)
        {
            left[i] = A[i];                             // Filling the elements of the array accordingly.
        }
        for (int i = mid; i < A.length; i++)
        {
            right[i - mid] = A[i];
        }
        left = mergeSort(left);                         // First this function/method will keep calling itself until there's only one element is left in the left most sub-array. (DFS)      // Can also be written as: mergeSort(left); (because left array is passed as reference as array is an object in java and therefore, actual argument, i.e. the left array will be updated)
        right = mergeSort(right);                       // This will first execute for the right array of the left most array and then will execute according to the recursion tree. (DFS)   // Can also be written as: mergeSort(right); (because right array is passed as reference as array is an object in java and therefore, actual argument, i.e. the right array will be updated)
        A = mergeSubArrays(left, right, A);             // This method will first return the merged sub-arrays to one of the left arrays of the main input array and then return according to the recursion tree. (DFS) // Can also be written as: return mergeSubArrays(left, right, A); (mergeSort(int[] A) method will basically return the updated/sorted A, since A is passed as reference argument).
        return A;
    }

    public static int[] mergeSubArrays(int[] left, int[] right, int[] A) {
        int i = 0, j = 0, k = 0;                        // i is index of left, j is index of right, k is index of A
        while (i < left.length && j < right.length)     // Checking if there are elements in both the arrays to be compared with each other.
        {
            if (left[i] <= right[j])                    // Comparing elements in left with elements in right
            {
                A[k++] = left[i++];                     // And then inserting the element in A and then incrementing the indices, accordingly.
            }
            else
            {
                A[k++] = right[j++];
            }
        }
        while (i < left.length)                        // Case when there are no elements in right array to be inserted in A.
        {
            A[k++] = left[i++];
        }
        while (j < right.length)                       // Case when there are no elements in the left array to be inserted in A.
        {
            A[k++] = right[j++];
        }
        return A;
    }
}
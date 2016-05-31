// Sorting elements of an array using quick sort. This algorithm follows "divide and conquer" strategy.
/*
Choose pivot element one by one and place it to its appropriate/sorted index by partitioning the input array such that
all elements lesser than or equal to itself are on its left and all elements greater than it are on its right. Repeat
this process of partitioning by dividing the input array recursively until all elements are partitioned.
*/
// Worst Time: O(n^2). Worst Space: O(n). (Without using "randomizedPartition" method)
// Unstable. In-place. Internal. Recursive.
/*
Average/Best Time: O(n log n) and Average/Best Space: O(log n) because of the randomized partition method which
selects a random pivot instead of a fixed pivot. It is also used in some of the libraries of languages,
because practically, quick sort performs slightly better than merge sort in most cases because of the
same time complexity with much better space complexity on average.
*/

package Algorithms.SortingAlgorithms;

import java.util.Arrays;
import java.util.Random;

class QuickSort
{
    public static void main(String[] args)
    {
        int A[] = {7,4,10,9,1,5,8,2,6,3};
        A = quickSort(A, 0, A.length - 1);                                  // Passing start and end index of the array being passed as well.
        System.out.println(Arrays.toString(A));
    }

    public static int[] quickSort(int[] A, int start, int end)
    {
        if (start>=end)                                                     // Base/exit condition for recursion.
        {
            return A;                                                       // return if the array is invalid or if it has only one element.
        }
        int partitionIndex = randomizedPartition(A, start, end);            // This will select the pivot, and return its index after partitioning.
        A = quickSort(A, start, partitionIndex-1);                          // First left side of the initial partition will be sorted. (DFS)
        A = quickSort(A, partitionIndex+1, end);
        return A;                                                           // quickSort(int[] A) returns the array after sorting it, which was passed in it as an argument.
    }

    public static int randomizedPartition(int[] A, int start, int end)      // Selecting a random pivot
    {
        Random r = new Random();
        int PivotIndex = r.nextInt(end-start+1)+start;                      // Selects a random pivot index
        int temp = A[PivotIndex];                                           // And then swaps its value with the value in the last/end index.
        A[PivotIndex] = A[end];
        A[end] = temp;
        return partition(A, start, end);                                    // Calls the partition method with the updated value of the end index.
    }

    public static int partition(int[] A, int start, int end)                // This partitions the array, meaning this method selects a pivot and then places all the elements <= itself on its left and rest on its right, thereby, finding the exact index of the pivot in the actual sorted array and returns it.
    {
        int pivot = A[end];                                                 // Selects the last element as the pivot element.
        int partitionIndex = start;                                         // First assign the partition index value of start and then update/increment its value accordingly.
        for (int i=start;i<end;i++)
        {
            if (A[i] <= pivot)                                              // If elements are lesser than or equal to the value of pivot.
            {
                int temp = A[i];                                            // Swap value at index 'i' with the value at partition index.   (If values of A[i} are <= partition index initially, then swap will execute at the same index)
                A[i] = A[partitionIndex];                                   // If values of A[i} are > partition index initially, then loop will continue and value of i will be incremented but value of partition index will remain the same.
                A[partitionIndex] = temp;
                partitionIndex++;                                           // And increment the partition index.
            }
        }
        int temp = A[partitionIndex];                                       // At the end of the loop, swap the value in partition index with the pivot i.e. A[end}.
        A[partitionIndex] = A[end];                                         // In other words, assigning the value of pivot to partition index, since the partition index should be the index of pivot, in the end.
        A[end] = temp;
        return partitionIndex;                                              // Returns the partition index, which is the actual index of the pivot element in the actual sorted array.
    }
}
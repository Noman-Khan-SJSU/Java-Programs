// Find the number of times a sorted array is right rotated (anti-clockwise).
// If the question has duplicate elements then, binary search can't be implemented.
// However, it can easily be solved using iterative approach. Only linear search is applicable for duplicate elements.

package Algorithms.BinarySearch;

class RotationsOfSortedArray
{
    public static void main(String[] args)
    {
        int A[] = {9,10,13,1,3,4,5,7};
        int count = findRotationCount(A);                                          // Binary Search
        //int count = rotations(A);                                               // Iterative Approach (Linear Search)
        System.out.println("Array has been rotated " +count+ " time(s)!");
    }
    // Time Complexity: O(log n)                             // Here base of the log is 2. However base value is in the time complexity expressions is insignificant.
    public static int findRotationCount(int A[])        // CIQ
    {
        int start = 0;
        int end = A.length - 1;
        while (start<=end)
        {
            if (A[start] <= A[end])
                return start;                           // Case 1: If the array is already sorted then it is rotated 0 times.
            int mid = start + (end-start)/2;
            int prev = (mid-1+A.length)%A.length;       // mod is taken since first element could be mid and we don't want to have a negative index
            if (A[mid] < A[prev])                       // Only the smallest element will have the property of A[index} < A[index-1].
                return mid;                             // Case 2: If mid is the smallest element. Finding the index of the smallest element is equal to the number of rotations.
            else if (A[mid] < A[end])                   // Case 3: Right side of the mid element is sorted. Therefore, smallest element is on the left side, since mid isn't the smallest element and its right side is sorted.
                end = mid - 1;
            else                                        // (A[mid] > A[start])
                start = mid+1;                          // Case 4: Left side of the mid element is sorted. Therefore, smallest element is on the right side, since mid isn't the smallest element and its left side is sorted.
        }
        return -1;                                      // This statement will never run for all the proper input arrays.
    }

}
    // Iterative approach. Time Complexity: O(n).
    //public static int rotations(int A[])
    //{
    //    for (int i=1;i<A.length;i++){
    //        if (A[i]<A[i-1])
    //            return i;
    //    }
    //    return 0;
    //}
// Search an element in a circular sorted array using binary search.
// Binary search can't be applied if the array has duplicate elements. Only linear search is applicable for duplicate elements, Time: O(n).
// Time Complexity: O(log(n)).

package Algorithms.BinarySearch;

import java.util.Scanner;

class SearchInCircularSortedArray
{
    public static void main(String[] args)
    {
        int A[] = {8,11,13,17,22,29,0,3,5,6,7};
        System.out.print("Enter the number: ");
        Scanner input = new Scanner(System.in);
        int in = input.nextInt();
        int index = circularArraySearch(A, in);
        if (index != -1)
        System.out.println("Index of " +in+ " in the given array is " +index);
        else System.out.println("Number not in Array!");
    }

    public static int circularArraySearch(int A[], int in)      // CIQ
    {
        int start = 0;
        int end = A.length - 1;
        while (start<=end)
        {
            int mid = start + (end-start)/2;
            if (A[mid] == in)                           // Case 1: if input is equal to A[mid).
                return mid;
            if (A[mid] <= A[end])                       // Half of the elements from the mid (either right or left) will always be sorted.
            {                                           // Case 2: Here, right half is sorted.
                if (in > A[mid] && in <= A[end])
                    start = mid + 1;                    // Case 2(a): if element is in the right sorted part.
                else
                    end = mid -1;                       // Case 2(b): if element is not in the right sorted past, it will on the left side.
            }
            else //if (A[mid] >= A[start])              // Half elements from the mid (either left or right) will always be sorted.
            {                                           // Case 3: Here, left half is sorted.
                if (in >= A[start] && in < A[mid] )
                    end = mid - 1;                      // Case 3(a): if element is in the left sorted part.
                else
                    start = mid + 1;                    // Case 3(b): if element is not in the left sorted past, it will on the right side.
            }
        }
        return -1;
    }

}
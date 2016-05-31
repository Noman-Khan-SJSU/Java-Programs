// Find the count of a number in a sorted array.
// Whenever the word "sorted" comes in a question, just apply binary search, dude.
// Time Complexity: O(log(n))

package Algorithms.BinarySearch;

import java.util.Scanner;

class CountOfAnElementInSortedArray
{
    public static void main(String[] args)
    {
        int A[] = {1,2,3,3,4,5,5,5,6,7,7,8,9,9,9};
        System.out.print("Enter the number: ");
        Scanner input = new Scanner(System.in);
        int in = input.nextInt();
        int count=0;
        int firstIndex = binarySearch(A, in, true);
        if (firstIndex == -1)
            System.out.println("Count of " +in+ " is " + count);
        else
        {
            int lastIndex = binarySearch(A, in, false);
            count = (lastIndex - firstIndex) + 1;
            System.out.println("Count of " + in + " is " + count);
        }
    }

    public static int binarySearch(int A[], int in, boolean b)              // CIQ
    {
        int start = 0;
        int end = A.length - 1;
        int result = -1;
        while (start<=end)
        {
            int mid = start + (end-start)/2;        //Same as: int mid = (start+end)/2; but slightly better.
            if (A[mid] == in)
            {
                result = mid;
                if (b)
                    end = mid - 1;
                else
                    start = mid + 1;
            }
            else if (A[mid] > in)
                end = mid - 1;
            else
                start = mid + 1;
        }
        return result;
    }

}
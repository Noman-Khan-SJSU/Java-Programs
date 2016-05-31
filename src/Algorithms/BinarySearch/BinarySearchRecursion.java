package Algorithms.BinarySearch;

class BinarySearchRecursion
{

    public static void main(String[] args)
    {
        int A[] = {1,2,3,4,5,6,7,8,9,10};
        int num = 2;
        int start = 0;
        int end = A.length - 1;
        int index = binarySearch(A,num, start, end);
        if (index == -1)
            System.out.println(num + " is not found in the given array!");
        else
            System.out.println("Index of "+num+ " in the given array is " + index);
    }

    public static int binarySearch(int A[], int num, int start, int end)
    {
        if (start>end)
            return -1;
        int mid = start + (end-start)/2;        //Same as: int mid = (start+end)/2;
            if (num == A[mid])
                return mid;
            else if (num > A[mid] )
                return binarySearch(A, num, mid+1, end);
            else
                return binarySearch(A, num, start, mid-1);
    }

}

// Binary search algorithm using recursion to find an element in a sorted array.
// Used whenever elements are sorted. Time complexity: O(log n).
// Any recursive program can be written in iterative (having loop statement(s)) as well, and vice versa is also true.
// In most cases, iterative program is better in performance than its recursive counterpart, but the latter is more easier
// to write. However, one may write a program in anyway for practical purposes.
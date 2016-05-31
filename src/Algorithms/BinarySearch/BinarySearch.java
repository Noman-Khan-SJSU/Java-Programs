package Algorithms.BinarySearch;

class BinarySearch
{
    public static void main(String[] args)
    {
        int A[] = {1,2,3,4,5,6,7,8,9,10};
        int num = 3;
        int index = binarySearch(A,num);
        if (index == -1)
            System.out.println("Number not found in the given array!");
        else
            System.out.println("Index of " +num+ " in the given array is " + index);

    }

    public static int binarySearch(int A[], int num)
    {
        int start = 0;
        int end = A.length - 1;
        while (start<=end)
        {
            int mid = (start+end)/2;        // "int mid = start + (end-start)/2" is slightly better since it will not go out of range of the integer type for very large values of (start+end).
            if (num == A[mid])
                return mid;
            else if (num > A[mid] )
                start = mid + 1;
            else
                end = mid - 1;
        }
        return -1;
    }

}

//Binary search algorithm is used to find an element in a sorted array.
//Used whenever elements are sorted. Time complexity: O(log n).

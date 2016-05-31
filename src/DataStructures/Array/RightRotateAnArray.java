package DataStructures.Array;

import java.util.Arrays;

class RightRotateAnArray {

    public static void main(String[] args) {

        int A[] = {1,2,3,4,5,6,7,8,9,10};
        A = rightRotate(A);
        System.out.println(Arrays.toString(A));

    }

    public static int[] rightRotate(int B[]){

        int temp = B[B.length-1];
        for (int i=B.length-2;i>=0;i--)
            B[i+1] = B[i];
        B[0] = temp;
        return B;

    }
}

//Rotating an array once to the right or anti-clockwise.
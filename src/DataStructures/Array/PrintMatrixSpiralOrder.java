// Print 2-D array (matrix) in spiral order. (clockwise)

package DataStructures.Array;

class PrintMatrixSpiralOrder {

    public static void main(String[] args) {
        int[][] A = {{2,4,6,8},{5,9,12,16},{2,11,5,9},{3,2,1,8}};
        System.out.println("Original Array: ");
        display(A);
        System.out.println();
        System.out.println("Spiral Printing: ");
        printSpiral(A,4,4);
    }

    public static void printSpiral(int[][] A, int rows, int columns) {

        int T = 0;                      // Top most row
        int B = rows-1;                 // Bottom most row
        int L = 0;                      // Left most column
        int R = columns-1;              // Right most column
        int dir = 0;                    // direction (0 = left to right, 1 = top to bottom, 2 = right to left, 3 = bottom to top.

        while (T <= B && L<= R)
        {
            if (dir == 0)
            {
                for (int i=L; i<=R ; i++)
                    System.out.print(A[T][i]+" ");
                T++;
            }
            else if (dir == 1)
            {
                for (int i=T; i<=B;i++)
                    System.out.print(A[i][R]+" ");
                R--;
            }
            else if (dir == 2)
            {
                for (int i=R; i>=L; i--)
                    System.out.print(A[B][i]+" ");
                B--;
            }
            else    // if (dir ==3)
            {
                for (int i=B ; i>=T; i--)
                    System.out.print(A[i][L]+" ");
                L++;
            }
            dir = (dir+1)%4;
        }
    }

    public static void display(int x[][]) {

        for (int row = 0; row < x.length; row++) {
            for (int column = 0; column < x[row].length; column++) {
                System.out.print(x[row][column] + "\t");
            }
            System.out.println();
        }
    }

}
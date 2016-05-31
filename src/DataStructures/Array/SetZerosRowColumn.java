// If an element in an M * N matrix is 0, set its entire row and column as 0.   // CCI (1.7)

package DataStructures.Array;

class SetZerosRowColumn {

    public static void main(String[] args) {

        int[][] A = {{1, 2, 3, 4}, {5, 6,0,8}, {9, 10, 11, 12},{13, 14, 15, 16}};
        System.out.println("Original Matrix: ");
        display(A);
        System.out.println();
        setZeros(A);
        System.out.println("After Setting Zeros: ");
        display(A);
    }

    public static void setZeros(int[][] A) {

        boolean[] row = new boolean[A.length];
        boolean[] column = new boolean[A[0].length];

        // Store the row and column index with value 0
        for (int i=0; i < A.length; i++) {
            for (int j=0; j < A[0].length; j++) {
                if (A[i][j] == 0) {
                    row[i] = true;
                    column[j] = true;
                }
            }
        }

        // Set A[i][j] to 0 if either row i or column j has a 0
        for (int i=0; i < A.length; i++) {
            for (int j=0; j < A[0].length; j++) {
                if (row[i] || column [j])
                    A[i][j] = 0;
            }
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
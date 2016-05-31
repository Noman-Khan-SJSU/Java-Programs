// Rotate a given square matrix (N * N) by 90 degrees.
// Time Complexity: O(N^2) i.e. O (n). (Best complexity: parsing every element once)

package DataStructures.Array;

class RotateMatrix {

    public static void main(String[] args) {

        int[][] A = {{1, 2, 3, 4}, {5, 6,7,8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        System.out.println("Before Rotation: ");
        display(A);
        System.out.println();
        rotate(A);
        System.out.println("After Rotation: ");
        display(A);
    }

    public static void rotate(int[][] A) {                          // CCI (1.6)

        for (int layer = 0; layer < A.length / 2; layer++) {
            int first = layer;
            int last = A.length - 1 - layer;
            for (int i = first; i < last; i++) {

                int offset = i - first;

                //save top
                int top = A[first][i];

                // left -> top
                A[first][i] = A[last - offset][first];

                // bottom -> left
                A[last - offset][first] = A[last][last - offset];

                // right -> bottom
                A[last][last - offset] = A[i][last];

                // top -> right
                A[i][last] = top;
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
package DataStructures.Array;

class Traversing2DArrays {

    public static void main(String[] args) {

        //first [] is for rows and second [] is for column.
        int[][] firstarray = {{1,2,3,4}, {5,6,7,8}};
        int[][] secondarray = {{4,5,8,9},{6},{1,3,7}};


        System.out.println("This is the first 2D array: ");
        display(firstarray);

        System.out.println("This is the second 2D array: ");
        display(secondarray);

    }

    public static void display(int[][] x) {

        for(int row=0;row<x.length;row++){
            for (int column=0; column<x[row].length;column++) {
                System.out.print(x[row][column] + "\t");
            }
            System.out.println();
        }

    }

}

/*Traversing elements of 2D arrays*/
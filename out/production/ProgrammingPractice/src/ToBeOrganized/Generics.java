/*
Implementing a generic method. Generic methods can take any type of data (generic data)
as argument and can return generic data as well. So, instead of writing many
overloaded methods, we can have just one generic method.
*/

package ToBeOrganized;

class Generics {

    public static void main(String[] args) {

        Integer[] iarray = {1, 2, 3, 4};
        Character[] carray = {'a', 'b', 'c', 'd'};
        String[] sarray = {"one", "two", "three", "four"};
        Double[] darray = {1.1, 1.2, 1.3, 1.4};

        printMe(iarray);
        printMe(carray);
        printMe(sarray);
        printMe(darray);

        System.out.println("Max data in Integer Array is : " + max(iarray));
        System.out.println("Max data in Character Array is : " + max(carray));
        System.out.println("Max data in String Array is : " + max(sarray));
        System.out.println("Max data in Double Array is : " + max(darray));

    }

    //Generic method accepting any type of data
    public static <T> void printMe(T[] x) {          //<T> is known as Type parameter.

        for (T y: x)
            System.out.print(y + " ");
        System.out.println();

    }

    //Generic method accepting and returning any type of data
    public static <T extends Comparable<T>> T max(T[] x) {      //Methods of Comparable class can be used in this method

        T max = x[0];
        if(x[1].compareTo(max) > 0)
            max = x[1];
        if(x[2].compareTo(max) > 0)
            max = x[2];
        if(x[3].compareTo(max) > 0)
            max = x[3];
        return max;

    }

}
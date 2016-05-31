package DataStructures.String;

class MissingRanges {

    public static void main(String[] args) {

        int[] A = {0,1,3,50,75};
        String result = missingRanges(A);
        System.out.println(result);
    }

    public static String missingRanges(int[] A) {

        StringBuilder result = new StringBuilder();
        for (int i=0; i<A.length-1;i++) {

            if (A[i+1] - A[i] == 1)
                continue;
            else if (A[i+1] - A[i] == 2 )
                result.append(A[i]+1 + ", ");
            else {
                result.append(A[i]+1 + "->" + (A[i+1]-1) +", ") ;
            }
        }
        result.append(A[A.length-1]+1 + "->" + 99);
        return result.toString();
    }

}
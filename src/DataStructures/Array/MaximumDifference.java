// Time: n. Space: 1.

package DataStructures.Array;

class MaximumDifference {

    public static void main(String[] args) {
        int[] A = {3, 2, 1, 4, 0, 6, 8, 9, 7};
        System.out.println(maxDifference(A));
    }

    public static int maxDifference(int[] A) {

        if (A.length == 0)
            return -1;
        if (A.length == 1)
            return 0;
        int min = A[0];
        int max = A[0];
        for (int i = 1; i < A.length; i++) {
            if (A[i] < min)
                min = A[i];
            if (A[i] > max)
                max = A[i];
        }
        return max-min;
    }

// This question could be modified so that elements represents share value for a stock.
// Find the max profit by buying and selling the stock. Or give the buying and selling price as well.

//    public static int maxProfit(int[] A) {
//        int maxProfit=0;
//        int minValue=Integer.MAX_VALUE;
//        for(int i=0;i<A.length;i++){
//            if(A[i]<minValue)
//                minValue=A[i];
//            int profit=A[i]-minValue;
//            if(profit>maxProfit)
//                maxProfit=profit;
//        }
//        return maxProfit;
//    }

}
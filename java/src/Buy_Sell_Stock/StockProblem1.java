package Buy_Sell_Stock;

public class StockProblem1 {
    public static void main(String[] args) {

        int[] A = {7,8,1,7,5,3,9,6};

        int Max_Profit = 0;
        int Min_Stock_Price = Integer.MAX_VALUE;

        for(int i=0; i<A.length; i++){

            Min_Stock_Price =  Math.min(Min_Stock_Price,A[i]);
            Max_Profit = Math.max(Max_Profit, A[i] - Min_Stock_Price);
        }
        System.out.println(Max_Profit);

    }
}

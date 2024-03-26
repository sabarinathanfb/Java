package Deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class MaximumInWindow {
    public static void main(String[] args) {
        int[] A = {1 ,2 ,3,4,5};
        //3, 1, 2, 4, 5
        int k = 3;
        System.out.println(MaxWindowSum(A,k));
        System.out.println(MaxWindowSum2(A,k));
    }
    static int  MaxWindowSum(int[] A, int k){
        //https://www.geeksforgeeks.org/problems/ipl-2021-match-day-2--141634/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=bottom_sticky_on_article
        int Total_Max_sum = 0;
        Deque<Integer> Dq = new ArrayDeque<>();

        for (int i=0; i<A.length; i++){
            while(!Dq.isEmpty() && Dq.peek() == i-k ){

                Dq.poll();
            }
            while (!Dq.isEmpty() && A[Dq.peekLast()] <= A[i]){
                Dq.pollLast();
            }

            Dq.offer(i);

            if(i >= k-1 && !Dq.isEmpty()){

                Total_Max_sum += A[Dq.peek()];
            }
        }
        return Total_Max_sum;


    }
    static int MaxWindowSum2(int[] A, int k){
        if (A.length == 0 || k <= 0) {
            return 0;
        }

        int n = A.length;
        int Total_Max_sum = 0;

        for (int i = 0; i < n-k+1; i++) {
            int max = A[i];
            for(int j=i+1; j < i+k; j++){
                if(A[j] >max){
                    max = A[j];
                }
            }
            Total_Max_sum += max;

        }

        return Total_Max_sum;
    }
}

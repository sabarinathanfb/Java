package Deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class MaximumInWindow {
    public static void main(String[] args) {
        int[] A = {5,4,3,2,1};
        int k = 3;

        System.out.println(MaxWindowSum(A,k));
    }
    static int  MaxWindowSum(int[] A, int k){
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
        if (A == null || A.length == 0 || k <= 0) {
            return 0;
        }

        int n = A.length;
        int Total_Max_sum = 0;
        int currentMax = Integer.MIN_VALUE;

        // Calculate the maximum element in the first window of length k
        for (int i = 0; i < k; i++) {
            currentMax = Math.max(currentMax, A[i]);
        }

        Total_Max_sum += currentMax; // Initialize Total_Max_sum with the max of first window

        // Slide the window and update the maximum sum
        for (int i = k; i < n; i++) {
            // If the maximum element of the previous window is no longer in the current window, find the maximum element in the current window
            if (A[i - k] == currentMax) {
                currentMax = Integer.MIN_VALUE;
                for (int j = i - k + 1; j <= i; j++) {
                    currentMax = Math.max(currentMax, A[j]);
                }
            } else {
                currentMax = Math.max(currentMax, A[i]);
            }

            Total_Max_sum += currentMax;
        }

        return Total_Max_sum;
    }
}

package InterviewProblems;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class MaxInWindow {
    public static void main(String[] args) {
        int[] A = {3,4,5,6,7,78,99,43,57,11};

        int[] Ans1 = bruteForce(A,3);
        System.out.println(Arrays.toString(Ans1));
        int[] Ans2 = optimize(A,3);
        System.out.println(Arrays.toString(Ans2));

    }

    static int[] bruteForce(int[] A,int k){

        int len = A.length;
        int[] Ans = new int[len-k+1];

        for(int i=0; i<len-k+1; i++){
            int max = A[i];
            for(int j=i; j<i+k;j++){

                if(max < A[j]){
                    max = A[j];
                }
            }

            Ans[i] = max;

        }
        return Ans;
    }

    static int[] optimize(int[] A,int k){

        int len = A.length;

        int[] Ans = new int[len - k +1];
        Deque<Integer> Dq = new ArrayDeque<>();


        int Index = 0;

        for(int i=0; i<len; i++){

            while(!Dq.isEmpty() && Dq.peek() == i - k){
                Dq.poll();
            }
            while(!Dq.isEmpty() && A[Dq.peekLast()] <= A[i]){

                Dq.pollLast();
            }
            Dq.offer(i);
            if(!Dq.isEmpty() && i >= k-1 ){

                Ans[Index++] = A[Dq.peek()];
            }
        }

        return Ans;
    }
}

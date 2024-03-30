package InterviewProblems;

import java.util.Arrays;

public class ColorSort {
    public static void main(String[] args) {


        int[] A = {1,2,0,1,1,1,0,2,0,2,2,0};
        int[] Ans = bruteForce(A);
        System.out.println(Arrays.toString(Ans));
        System.out.println(Arrays.toString(A));
        dutchNationFlag(A);
        System.out.println(Arrays.toString(A));

    }
    static int[] bruteForce(int[] A){
        int len = A.length;
        int[] Ans = new int[len];
        int[] frequency = new int[3];
        for(int color : A){

            frequency[color]++;
        }
        int Index = 0;
        for (int color = 0; color <= 2 ; color++) {

            while (Index < len && frequency[color] > 0){

                Ans[Index++] = color;
                frequency[color]--;
            }

        }
        return Ans;
    }

    static void dutchNationFlag(int[] A){

        int len = A.length;

        int Start =0;
        int Mid = 0;
        int End = len-1;

        while(Mid <= End){

            if(A[Mid] == 0){
                int temp = A[Start];
                A[Start] = A[Mid];
                A[Mid] = temp;

                Start++;
                Mid++;
            } else if (A[Mid] == 1) {
                Mid++;
            }else{
                int temp = A[Mid];
                A[Mid] = A[End];
                A[End] = temp;
                End--;

            }
        }
    }
}

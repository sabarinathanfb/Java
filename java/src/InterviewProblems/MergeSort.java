package InterviewProblems;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] A = {45,67,89,90,0,0,0};
        int[] B = {44,67,92};

        int[] Ans = bruteForce(A,B);
        System.out.println(Arrays.toString(Ans));
        System.out.println(Arrays.toString(A));
        mergeSort(A,B);
        System.out.println(Arrays.toString(A));

    }

    static int[] bruteForce(int[] A,int[] B){



        for (int i = 0; i < B.length; i++) {
            A[A.length-3+i] = B[i];

        }

        Arrays.sort(A);

        return A;

    }

    static void mergeSort(int[] A, int[] B){

        int m = 4;
        int n=3;

        int i=m-1; int j= n-1; int k=A.length-1;

        while (j>=0){

            if(i>=0 && A[i] >= B[j]){
                A[k--] = A[i--];
            }else{
                A[k--] = B[j--];
            }
        }
    }
}

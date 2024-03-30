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

        int[] Ans = new int[A.length];

        int m = 4;
        int n = 3;

        int i=0; int j=0; int k=0;
        while(i<m && j <n){

            if(A[i] <= B[j]){
                Ans[k++] = A[i++];
            }else {
                Ans[k++] = B[j++];
            }
        }
        while (i<m){
            Ans[k++] = A[i++];
        }
        while (j<n){
            Ans[k++] = B[j++];
        }

        return Ans;

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

package MergeSort;

import java.util.Arrays;

public class MergeTwoSortedArrayInFirstArray {
    public static void main(String[] args) {
        int[] A = {3,6,7,8,9,0,0,0,0};
        int[] B = {4,7,9,10};


        int N =A.length;
        int M = B.length;

        int i=N-5;
        int j = M-1;
        int k = N-1;

        while( i >=0 && j>=0){

            if(A[i] >= B[j]){

                A[k] = A[i];
                i--;
            }else{
                A[k] = B[j];
                j--;
            }
            k--;
        }
        while(i>=0){
            A[k] = A[i];
            i--;k--;
        }
        while (j>=0){
            A[k] = B[j];
            j--;k--;
        }
        System.out.println(Arrays.toString(A));
    }
}

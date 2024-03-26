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

        while(j >=0){
            if(i >=0 && A[i] >= B[j]){
                A[k--] = A[i--];
            }else{
                A[k--] = B[j--];
            }
        }
        System.out.println(Arrays.toString(A));
    }
}

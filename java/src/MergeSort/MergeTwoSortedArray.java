package MergeSort;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MergeTwoSortedArray {
    public static void main(String[] args) {
        int[] A = {5,6,7,7,8,9};
        int[] B = {1,5,6,7,8,9};
        int N = A.length;
        int M = B.length;
        int[] Ans = new int[N+M];

        int i =0, j=0, k = 0;

        while (i<N && j <M){

            if(A[i] <= B[j]){
                Ans[k] = A[i];
                i++;
            }else {
                Ans[k] = B[j];
                j++;
            }
            k++;
        }
        while (i<N){
            Ans[k] = A[i];
            i++;
            k++;
        }
        while (j<M){
            Ans[k] = B[j];
            j++;
            k++;
        }

        System.out.println(Arrays.toString(Ans));
    }
}

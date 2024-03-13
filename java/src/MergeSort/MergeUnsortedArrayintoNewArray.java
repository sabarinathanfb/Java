package MergeSort;

import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;
import java.util.Arrays;

public class MergeUnsortedArrayintoNewArray {
    public static void main(String[] args) {
        int[] A = {8,7,5,4,3,2,1};

        System.out.println(Arrays.toString(mergeSort(A,0,A.length-1)));
    }

    public static int[] mergeSort(int[] A,int S,int E){

        if(S == E){
            return new int[]{A[S]};
        }
        int mid = S + (E-S)/2;

        int[] A_1 = mergeSort(A,S,mid);
        int[] A_2 = mergeSort(A,mid+1,E);
        return MergeTwoSortedArray(A_1,A_2);
    }
    public static int[] MergeTwoSortedArray(int[] A,int[] B){
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
        return Ans;
    }
}

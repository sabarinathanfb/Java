package MergeSort;

import java.util.Arrays;

public class MergeSortInOwnArray {
    public static void main(String[] args) {
        int[] A = {35,456,7,58,9,5,6,5636,3,68,657567,4,634,55,35,356,53,53};
        mergeSort(A,0,A.length);
        System.out.println(Arrays.toString(A));
    }

    public static void mergeSort(int[] A,int S,int E){

        if(E-S == 1){
            return ;
        }
        int mid = S + (E-S)/2;

        mergeSort(A,S,mid);
        mergeSort(A,mid,E);
        MergeTwoSortedArray(A,S,mid,E);
    }
    public static void MergeTwoSortedArray(int[] A,int s,int m,int e){
        int[] mix = new int[e - s];
        int i = s;
        int j = m;
        int k = 0;

        while (i < m && j < e) {
            if (A[i] < A[j]) {
                mix[k] = A[i];
                i++;
            } else {
                mix[k] = A[j];
                j++;
            }
            k++;
        }

        // it may be possible that one of the arrays is not complete
        // copy the remaining elements
        while (i < m) {
            mix[k] = A[i];
            i++;
            k++;
        }

        while (j < e) {
            mix[k] = A[j];
            j++;
            k++;
        }

        for (int l = 0; l < mix.length; l++) {
            A[s+l] = mix[l];
        }

    }
}

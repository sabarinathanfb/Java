package MergeSort;

import java.util.Arrays;

public class MergeSortInOwnArray {
    public static void main(String[] args) {
        int[] A = {8,7,5,4,3,2,1};

        mergeSort(A, 0, A.length - 1);
        System.out.println(Arrays.toString(A));
    }

    public static void mergeSort(int[] A, int S, int E) {
        if (S < E) {
            int mid = S + (E - S) / 2;

            mergeSort(A, S, mid);
            mergeSort(A, mid + 1, E);
            merge(A, S, mid, E);
        }
    }

    public static void merge(int[] A, int S, int mid, int E) {
        int[] temp = new int[E - S + 1];
        int i = S, j = mid + 1, k = 0;

        while (i <= mid && j <= E) {
            if (A[i] <= A[j]) {
                temp[k++] = A[i++];
            } else {
                temp[k++] = A[j++];
            }
        }

        while (i <= mid) {
            temp[k++] = A[i++];
        }

        while (j <= E) {
            temp[k++] = A[j++];
        }

        for (i = S; i <= E; i++) {
            A[i] = temp[i - S];
        }
    }
}

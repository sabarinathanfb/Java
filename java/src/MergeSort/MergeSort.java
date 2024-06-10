package MergeSort;


import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {5,4545,8,9,6,4,32,4,5};

        System.out.println(Arrays.toString(mergeSort(arr,0, arr.length-1)));

    }

    public static int[] mergeSort(int[] a,int start,int end){

        if(start == end) {
            return new int[]{a[start]};
        }

        int mid = start + (end - start) /2;

        int[] A = mergeSort(a,start,mid);
        int[] B = mergeSort(a,mid+1,end);
        return mergeTwoUnSortedArray(A,B);


    }

    public static int[] mergeTwoUnSortedArray(int[] A,int[] B){

        int[] mergeSortedArray = new int[A.length + B.length];

        int i=0; int j=0; int k=0;

        while (i < A.length && j < B.length){

            if (A[i] <= B[j] ){
                mergeSortedArray[k] = A[i];
                i++;
                k++;

            }else {
                mergeSortedArray[k] = B[j];
                j++;
                k++;
            }
        }

        while(i < A.length){
            mergeSortedArray[k] = A[i];
            i++;
            k++;

        }
        while(j < B.length){
            mergeSortedArray[k] = B[j];
            j++;
            k++;

        }

        return mergeSortedArray;
    }
}



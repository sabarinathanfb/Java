package BinarySearch;

public class MaxEleInRotatedSortedArray {
    public static void main(String[] args) {
        int[] A = {4, 5, 6, 7, 0, 1, 2};
        int Target = 5;
        int max = maximumElement(A);

        if(A[0] <= Target && Target <=A[max]){
            System.out.println(BinarySearch(A,0,max,Target));
        }else{
            System.out.println(BinarySearch(A,max+1,A.length-1,Target));
        }
    }

    public static int maximumElement(int[] arr) {
        int S = 0;
        int E = arr.length - 1; // Corrected: Initialize E to arr.length - 1

        while (S < E) {
            int M = S + (E - S) / 2;
            if (arr[S] < arr[M]) {
                S = M;
            } else {
                E = M;
            }
        }
        return S;
    }
    public static int BinarySearch(int[] A,int S,int E,int target){


        while(S <= E){
            int mid = S+(E-S)/2;
            if(A[mid] == target) {
                return mid;
            } else if (target < A[mid]) {
                E = mid -1;

            }else {
               S = mid +1;
            }
        }

        return -1;

    }
}


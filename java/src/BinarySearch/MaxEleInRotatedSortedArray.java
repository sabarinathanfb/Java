package BinarySearch;

public class MaxEleInRotatedSortedArray {
    public static void main(String[] args) {
        int[][] A = {
                {11, 12, 18, 19, 22, 26, 28, 29, 30, 1, 2, 3, 4, 5, 6, 7},
                {26, 28, 29, 1, 2, 3, 4, 5, 6, 7, 11, 12, 18, 19, 22},
                { 1, 2, 3, 4, 5, 6, 7, 11, 12, 18, 19, 22, 26}
        };

        for (int[] nums : A) {
            System.out.println(maximumElement(nums));
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
                E = M-1;
            }
        }
        return arr[S];
    }
}


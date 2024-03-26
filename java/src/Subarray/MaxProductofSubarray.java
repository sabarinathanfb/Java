package Subarray;

public class MaxProductofSubarray {
    public static void main(String[] args) {

        int[] arr = {-2,-2,-3};
        int answer = maxProductSubArray(arr);

        System.out.println(maxProductNaive(arr));
        System.out.println("The maximum product subarray is: " + answer);
        int answer2 = maxProductSubArray1(arr);
        System.out.println("The maximum product subarray is: " + answer);

    }

    public static int maxProductNaive(int[] A){
        int N = A.length;
        int Max = A[0];
        for(int i=0; i<N; i++){
            int Curr_Product = 1;
            for(int j = i; j<N; j++){
                Curr_Product *= A[j];
                Max = Math.max(Max,Curr_Product);
            }

        }
        return Max;

    }
    public static int maxProductSubArray(int[] arr) {
        int n = arr.length; //size of array.
        int pre = 1, suff = 1;
        int ans = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (pre == 0) pre = 1;
            if (suff == 0) suff = 1;
            pre *= arr[i];
            suff *= arr[n - i - 1];
            ans = Math.max(ans, Math.max(pre, suff));
        }
        return ans;
    }
    static int maxProductSubArray1(int nums[]) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int maxProduct = nums[0];
        int minProduct = nums[0];
        int maxSoFar = nums[0];
        for (int i = 1; i < nums.length; i++) {
            // Swap max and min if the current element is negative
            if (nums[i] < 0) {
                int temp = maxProduct;
                maxProduct = minProduct;
                minProduct = temp;
            }

            maxProduct = Math.max(nums[i], maxProduct * nums[i]);
            minProduct = Math.min(nums[i], minProduct * nums[i]);

            maxSoFar = Math.max(maxSoFar, maxProduct);
        }

        return maxSoFar;
    }
}

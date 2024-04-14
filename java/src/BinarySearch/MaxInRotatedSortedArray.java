package BinarySearch;

public class MaxInRotatedSortedArray {
    public static int findMax(int[] nums) {
        if (nums == null || nums.length == 0)
            throw new IllegalArgumentException("Array is empty");

        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            // If the element at mid is less than or equal to the element at right,
            // it means the maximum element must be on the left side of mid,
            // or it could be the mid element itself, so we adjust right to mid.
            if (nums[mid] <= nums[right]) {
                right = mid;
            } else {
                // Otherwise, the maximum element must be on the right side of mid.
                left = mid + 1;
            }
        }

        // At this point, left and right will converge to the maximum element.
        return nums[left];
    }

    public static void main(String[] args) {
        // Test cases
        int[][] testCases = {
                {1, 2, 3, 4, 5},  // Maximum: 5
                {1},  // Maximum: 1
                {2, 1},  // Maximum: 2
                {3, 1, 2},  // Maximum: 3
        };

        // Iterate over test cases
        for (int[] testCase : testCases) {
            int max = findMax(testCase);
            System.out.println("Maximum element in the rotated sorted array: " + max);
        }
    }
}

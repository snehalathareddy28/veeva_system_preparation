// Question: Find the maximum sum of a non-empty contiguous subarray.
public class MaximumSubarraySum {
    public static int maxSum(int[] arr) {
        if (arr.length == 0) {
            throw new IllegalArgumentException("Array must not be empty");
        }

        int current = arr[0];
        int maximum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            current = Math.max(arr[i], current + arr[i]);
            maximum = Math.max(maximum, current);
        }
        return maximum;
    }
}

// Question: Find the maximum sum of any contiguous subarray of exactly k elements.
public class MaximumSumK {
    public static int maxSumK(int[] arr, int k) {
        if (k <= 0 || k > arr.length) {
            throw new IllegalArgumentException("k must be between 1 and the array length");
        }

        int windowSum = 0;
        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }
        int maximum = windowSum;
        for (int i = k; i < arr.length; i++) {
            windowSum += arr[i] - arr[i - k];
            maximum = Math.max(maximum, windowSum);
        }
        return maximum;
    }
}

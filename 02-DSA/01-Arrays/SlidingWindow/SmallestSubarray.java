// Question: Find the length of the smallest contiguous subarray with sum at least target.
// This sliding-window solution assumes all array values are positive.
public class SmallestSubarray {
    public static int smallestSubarray(int[] arr, int target) {
        int left = 0;
        int currentSum = 0;
        int minimumLength = Integer.MAX_VALUE;

        for (int right = 0; right < arr.length; right++) {
            currentSum += arr[right];
            while (currentSum >= target) {
                minimumLength = Math.min(minimumLength, right - left + 1);
                currentSum -= arr[left++];
            }
        }
        return minimumLength == Integer.MAX_VALUE ? 0 : minimumLength;
    }
}

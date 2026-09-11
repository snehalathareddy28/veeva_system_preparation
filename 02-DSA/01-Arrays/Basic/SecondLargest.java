// Question: Find the second-largest distinct value in an integer array.
// Return -1 when the array has fewer than two distinct values.
import java.util.Arrays;

public class SecondLargest {
    public static int secondLargestBySorting(int[] arr) {
        if (arr.length < 2) {
            return -1;
        }
        int[] copy = Arrays.copyOf(arr, arr.length);
        Arrays.sort(copy);
        for (int i = copy.length - 2; i >= 0; i--) {
            if (copy[i] != copy[copy.length - 1]) {
                return copy[i];
            }
        }
        return -1;
    }

    public static int secondLargestOnePass(int[] arr) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        boolean hasLargest = false;
        boolean hasSecondLargest = false;
        for (int value : arr) {
            if (!hasLargest || value > largest) {
                if (hasLargest) {
                    secondLargest = largest;
                    hasSecondLargest = true;
                }
                largest = value;
                hasLargest = true;
            } else if (value != largest
                    && (!hasSecondLargest || value > secondLargest)) {
                secondLargest = value;
                hasSecondLargest = true;
            }
        }
        return hasSecondLargest ? secondLargest : -1;
    }
}

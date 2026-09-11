// Question: Find and print the minimum and maximum values in an integer array.
public class MaxMin {
    public static void printMaxMin(int[] arr) {
        if (arr.length == 0) {
            throw new IllegalArgumentException("Array must not be empty");
        }

        int min = arr[0];
        int max = arr[0];
        for (int value : arr) {
            min = Math.min(min, value);
            max = Math.max(max, value);
        }
        System.out.println(min + ", " + max);
    }
}

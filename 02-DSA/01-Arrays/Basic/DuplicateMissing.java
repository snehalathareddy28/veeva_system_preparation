// Question: An array contains the numbers 1 through n with one duplicate and one missing.
// Print the duplicate number followed by the missing number.
public class DuplicateMissing {
    public static void findDuplicateAndMissing(int[] arr, int n) {
        int[] count = new int[n + 1];
        for (int value : arr) {
            if (value < 1 || value > n) {
                throw new IllegalArgumentException("Values must be between 1 and n");
            }
            count[value]++;
        }

        int duplicate = -1;
        int missing = -1;
        for (int value = 1; value <= n; value++) {
            if (count[value] > 1) {
                duplicate = value;
            } else if (count[value] == 0) {
                missing = value;
            }
        }
        System.out.println(duplicate + " " + missing);
    }
}

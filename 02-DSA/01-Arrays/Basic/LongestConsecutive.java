// Question: Find the length of the longest consecutive sequence in an unsorted array.
import java.util.HashSet;
import java.util.Set;

public class LongestConsecutive {
    public static int longestConsecutive(int[] arr) {
        Set<Integer> values = new HashSet<>();
        for (int value : arr) {
            values.add(value);
        }

        int longest = 0;
        for (int value : values) {
            if (!values.contains(value - 1)) {
                int current = value;
                int length = 1;
                while (values.contains(current + 1)) {
                    current++;
                    length++;
                }
                longest = Math.max(longest, length);
            }
        }
        return longest;
    }
}

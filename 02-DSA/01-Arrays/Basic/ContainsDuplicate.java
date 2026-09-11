// Question: Given an integer array, return true if any value appears at least twice.
import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public static boolean containsDuplicate(int[] arr) {
        Set<Integer> values = new HashSet<>();
        for (int value : arr) {
            if (!values.add(value)) {
                return true;
            }
        }
        return false;
    }
}

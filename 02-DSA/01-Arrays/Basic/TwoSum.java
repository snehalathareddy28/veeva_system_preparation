// Question: Return the indices of two distinct elements whose sum equals target.
// Return {-1, -1} when no such pair exists.
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static int[] twoSum(int[] arr, int target) {
        Map<Integer, Integer> indices = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int complement = target - arr[i];
            if (indices.containsKey(complement)) {
                return new int[]{indices.get(complement), i};
            }
            indices.put(arr[i], i);
        }
        return new int[]{-1, -1};
    }
}

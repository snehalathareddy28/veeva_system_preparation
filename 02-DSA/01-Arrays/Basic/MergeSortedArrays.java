// Question: Merge two sorted arrays into one sorted array.
public class MergeSortedArrays {
    public static int[] merge(int[] arr1, int[] arr2) {
        int[] merged = new int[arr1.length + arr2.length];
        int left = 0;
        int right = 0;
        int index = 0;

        while (left < arr1.length && right < arr2.length) {
            if (arr1[left] <= arr2[right]) {
                merged[index++] = arr1[left++];
            } else {
                merged[index++] = arr2[right++];
            }
        }
        while (left < arr1.length) {
            merged[index++] = arr1[left++];
        }
        while (right < arr2.length) {
            merged[index++] = arr2[right++];
        }
        return merged;
    }
}

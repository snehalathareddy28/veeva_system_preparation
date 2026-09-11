// Question: Move all zeroes to the end while preserving the order of non-zero values.
public class MoveZeros {
    // Two traversals: compact non-zero values, then fill the remaining positions with zeroes.
    public static void moveZerosTwoPass(int[] arr) {
        int index = 0;
        for (int value : arr) {
            if (value != 0) {
                arr[index++] = value;
            }
        }
        while (index < arr.length) {
            arr[index++] = 0;
        }
    }

    // One pass: swap each non-zero value into the next available position.
    public static void moveZerosOnePass(int[] arr) {
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                int temp = arr[index];
                arr[index] = arr[i];
                arr[i] = temp;
                index++;
            }
        }
    }
}

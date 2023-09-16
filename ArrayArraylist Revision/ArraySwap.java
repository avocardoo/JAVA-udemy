import java.util.Arrays;

public class ArraySwap {
    static void swapArray(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {5, 87, 98, 54, 366, 74};
        swapArray(arr, 1, 4);
        System.out.println(Arrays.toString(arr));
    }
}

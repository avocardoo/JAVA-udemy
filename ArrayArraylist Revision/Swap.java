import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
        int[] arr = {2, 58, 65, 74, 98, 25, 12};
        System.out.println(Arrays.toString(arr));

        swap(arr , 2, 5);
        System.out.println(Arrays.toString(arr));

    }

    private static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}

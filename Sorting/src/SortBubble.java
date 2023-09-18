import java.util.Arrays;

public class SortBubble {
    public static void main(String[] args) {
        int[] arr = {12, 35, -78, 65, -9, 14, -74, 32};
        bubblingSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubblingSort(int[] arr) {
        boolean swapped;
        for (int i = 0; i < arr.length - 1; i++) {
            swapped = false;
            for (int j = 1; j <= arr.length - i - 1; j++) {
                if (arr[j] < arr[j-1]) {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }
}

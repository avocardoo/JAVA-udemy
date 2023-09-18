import java.lang.reflect.Array;
import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {12, 58, 74, 36, 52, 12, 98, 46};
        //int[] arr = {5, 4, 3, 2, 1};
        bubbleSorting(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubbleSorting(int[] arr) {
        boolean swapped;
        //run the steps for n-1 times
        for (int i = 0; i < arr.length - 1; i++) {
            swapped = false;

            //for each step, max item will come at the last of respective index
            for (int j = 1; j <= arr.length - i - 1; j++) {
                //swapping if the item is smaller than the previous item
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }
}
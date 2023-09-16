import java.util.Arrays;

public class Reversing {
    public static void main(String[] args) {
        int[] arr = {2, 58, 65, 74, 98, 25, 12};
        System.out.println(Arrays.toString(arr));
        reverse(arr);

    }

    private static void reverse(int[] arr) {
        int i = 0;
        int j = arr.length-1;
        while (j > 1) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        System.out.println(Arrays.toString(arr));
    }
}

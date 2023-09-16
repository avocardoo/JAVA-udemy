import java.util.Arrays;

public class max {
    public static void main(String[] args) {
        int[] arr = {2, 58, 65, 74, 98, 987, 25, 12};
        System.out.println(Arrays.toString(arr));
        System.out.println(max(arr));
    }
    static int max(int[] arr) {
        int maxValue = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxValue) {
                maxValue = arr[i];
            }
        }
        return maxValue;
    }
}

import java.util.Scanner;

public class MaxArray {
    public static void main(String[] args) {
        int[] arr = {1, 58, 65, 987, 52};
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

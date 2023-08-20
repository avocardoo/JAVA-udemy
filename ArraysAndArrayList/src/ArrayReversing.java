import java.util.Arrays;
import java.util.Scanner;

public class ArrayReversing {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[6];
        for (int i = 0; i <arr.length; i++) {
            arr[i] = in.nextInt();
        }
        reverse(arr);
    }

    static void reverse(int[] arr) {
        int i = 0;
        int j = arr.length-1;
        while(j>i) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        System.out.println(Arrays.toString(arr));

    }
}

import java.util.Arrays;
import java.util.Scanner;

public class EnhancedDimension {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] arr = new int[3][3];
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = in.nextInt();
            }
        }
        for (int[] a : arr) {
            System.out.println(Arrays.toString(a));
        }

//        String[] arrS = new String[4];
//        System.out.println(arr[0]);
//
//        for (String element : arrS) {
//            System.out.println(element);
//        }
    }
}

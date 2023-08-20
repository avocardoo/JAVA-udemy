import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //array of primitives
//        int[] arr = new int[4];
//        arr[0] = 1;
//        arr[1] = 2;
//        arr[2] = 3;
//        arr[3] = 4;
//        System.out.println(arr[2]);

        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println(Arrays.toString(arr));

        for (int num : arr) {
            System.out.print(num + " ");
        }
        //System.out.println(arr[5]); //index out of bound error

    }
}
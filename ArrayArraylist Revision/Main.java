import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        //array of primitives
//        int[] arr = new int[4];
//        //new is a keyword in Java used to create new objects. In this case, it is creating a new integer array object with four elements.
//        arr[0] = 1;
//        arr[1] = 2;
//        arr[2] = 3;
//        arr[3] = 4;
//        //arr[4] = 5;
//        for (int i = 0; i < 4; i++) {
//            System.out.print(arr[i]);
//        }
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = in.nextInt();
        }

//        String arrString = Arrays.toString(arr);
//        System.out.println(arrString);

//        for (int num : arr) {
//            System.out.print(num + " ");
//        }
        for (int num : arr) {
            System.out.print(num + " ");
        }



    }
}
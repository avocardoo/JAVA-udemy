import java.lang.reflect.Array;
import java.util.Scanner;

public class MultiDimension {
    public static void main(String[] args) {
        /*
        1 2 3
        4 5 6
        7 8 9
         */

//        int[][] arr = new int[4][];
//
//        int[][] arr2D = {
//                {1, 2, 3},//0th index
//                {4, 5},//1st index
//                {6, 7, 8, 9}// 2nd index
//        };
        Scanner in = new Scanner(System.in);
        int[][] arr = new int[3][3];
        //input
//        System.out.println(arr.length);
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = in.nextInt();
            }

        }
        for (int row = 0; row < arr.length; row++) {
            //for each column in every row
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();

        }


    }

}

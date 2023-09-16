import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 4, 5, 6},
                {8, 9},
                {4, 58, 47},
                {14, 98}
        };
        System.out.println(Arrays.toString(search(arr, 14)));
        System.out.println(max(arr));
        System.out.println("Mininum value of integer " + Integer.MIN_VALUE);
        System.out.println("Maximum value of integer " + Integer.MAX_VALUE);

    }
    static int[] search(int[][] arr, int target) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target) return new int[]{row, col};
            }
        }
        return new int[]{-1, -1};
    }
    static int max(int[][] arr) {
        int max = Integer.MIN_VALUE;
        for (int[] ints : arr) {
            for (int element : ints) {
                if (element > max) {
                    max = element;
                }
            }
        }
        return max;
    }
}

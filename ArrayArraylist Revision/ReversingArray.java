import java.util.Arrays;

public class ReversingArray {
    public static void main(String[] args) {
        int[] arr ={4, 87, 98, 52, 65};
        reverseArray(arr);

    }

    static void reverseArray(int[] arr) {
        int i = 0;
        int j = arr.length - 1;
        while (j>1){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        System.out.println(Arrays.toString(arr));
    }
}



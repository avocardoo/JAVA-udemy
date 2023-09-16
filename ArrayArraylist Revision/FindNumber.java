public class FindNumber {
    public static void main(String[] args) {
        int[] arr = {12, 13, 14, 85, 97};
        System.out.println(isNumber(arr, 14));
    }

    private static int isNumber(int[] arr, int a) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == a) {
                return i;
            }
        }
        return -1;
    }
}

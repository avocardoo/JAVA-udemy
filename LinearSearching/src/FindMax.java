public class FindMax {
    public static void main(String[] args) {
        int[] arr = {18, 12, -7, 3, 14, -28};
        System.out.println(max(arr));
    }

    private static int max(int[] arr) {
        int ans = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > ans) {
                ans = arr[i];
            }
        }
        return ans;
    }
}

public class MaxRange {
    public static void main(String[] args) {
        int[] arr = {2, 32, 87, 92, 787, 54};
        System.out.println(max(arr, 2, 5));
    }
    static int max(int[] arr, int start, int end) {
        int maxValue = arr[0];
        for (int i = start; i < end; i++) {
            if (arr[i] > maxValue){
                maxValue = arr[i];
            }
        }
        return maxValue;
    }
}

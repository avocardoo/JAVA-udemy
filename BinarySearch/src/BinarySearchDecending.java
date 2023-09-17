public class BinarySearchDecending {
    public static void main(String[] args) {
        int[] arr = {103, 98, 87, 54, 32, 28, 14, 2, -6, -25, -66, -71};
        int target = -71;
        int ans = binarySearch(arr, target);
        System.out.println(ans);
    }

    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            //find the middle element
            int middleElement = start + (end-start) / 2;
            if (target < arr[middleElement]) {
                start = middleElement + 1;
            } else if (target > arr[middleElement]) {
                end = middleElement - 1;
            } else {
                return middleElement;
            }
        }
        return -1;
    }
}

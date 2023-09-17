public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        int[] arr1 = {103, 98, 87, 54, 32, 28, 14, 2, -6, -25, -66, -71};
        int[] arr2 = {-18, -12, -2, 0, 21, 38, 46, 61, 82, 91};
        int target = -71;
        int ans1 = binarySearch(arr1, target);
        int ans2 = binarySearch(arr2, 61);
        System.out.println(ans1);
        System.out.println(ans2);
    }
    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        //check whether array is in ascending or descending order:
        boolean isAsd = arr[start] < arr[end];

        while (start <= end) {
            //find the middle element
            int middleElement = start + (end-start) / 2;
            if (arr[middleElement] == target) {
                return middleElement;
            }
            if (isAsd) {
                if (target < arr[middleElement]) {
                    end = middleElement - 1;
                } else if (target > arr[middleElement]) {
                    start = middleElement + 1;
                }
            } else {
                if (target < arr[middleElement]) {
                    start = middleElement + 1;
                } else if (target > arr[middleElement]) {
                    end = middleElement - 1;
                }
            }
        }
        return -1;
    }
}

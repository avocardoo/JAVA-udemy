public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {18, 12, -7, 3, 14, 28};
        System.out.println(linearSearch(arr, 14, 1, 4));
    }
    static int linearSearch(int[] arr, int target, int rangeStart, int rangeEnd) {
        if (arr.length == 0) return -1;
        for (int index = rangeStart; index <= rangeEnd; index++) {
            if (arr[index] == target) return index;
        }
        return -1;
    }
}

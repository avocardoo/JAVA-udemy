public class Main {
    public static void main(String[] args) {
        int[] nums = {55, 78, 39, 21, 47};
        System.out.println(isFound(nums, 47));
    }

    //serach array if item found return index otherwise return -1;
    static int isFound(int[] arr, int target) {
        if (arr.length == 0) return -1;
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] == target) {
                return index;
            }
        }
//        for (int element : arr) {
//            if (element == target) {
//                return element;
//            }
//        }
        return -1;
    }
}
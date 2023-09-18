//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/
public class FirstAndLastPositionInSortedArray34 {
    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        int target = 8;
        System.out.println(binarySearch(nums, target));
    }
    static int[] binarySearch(int[] nums, int target) {

        int[] ans = {-1, -1};

        //check for first occurrence
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return ans;
    }
    //this function return the index value of target
    int search(int[] nums, int target, boolean findStartIndex) {
        int[] ans = {-1, -1};
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                ans = mid;
                if (findStartIndex == true) {
                    end = mid-1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}

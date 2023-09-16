import java.util.ArrayList;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {4, 5, 6, 7};
        System.out.println(twoSum(nums, 13));
    }

//    static void solution(int[] nums, int target) {
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] + nums[i + 1] == target) {
//                System.out.println(nums[i]);
//                System.out.println(nums[i+1]);
//            }
//        }
//    }
    public static int[] twoSum(int[] nums, int target) {
        int[] arr = new int[2];
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] + nums[i+1] == target) {
                arr = new int[]{nums[i], nums[i+1]};
                arr = new int[]{i, i + 1};
            }
        }
        return arr;
    }

}

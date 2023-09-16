import java.util.Spliterator;
//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
public class EvenDigits {
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};
        System.out.println(findNumbers(nums));
    }

    static int findNumbers(int[] nums) {
        int count = 0;
        for (int index = 0; index < nums.length; index++) {
            int number = nums[index];
            int digit = 0;
            while (number > 0) {
                digit++;
                number /= 10;
            } if (digit % 2 == 0) count++;
        }
        return count;
    }
}

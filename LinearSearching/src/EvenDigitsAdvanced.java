//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
public class EvenDigitsAdvanced {

    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};
        System.out.println(evenLength(nums));
        System.out.println(digits2(123456789));
    }
    static int digits2(int num) {
        if (num == 0) return 1;
        if (num < 0) {
            num *= -1;
        }
        return (int)(Math.log10(num) + 1);
    }
//    static int digits(int num) {
//        if (num == 0) return 1;
//        if (num < 0) {
//            num *= -1;
//        }
//        int count = 0;
//        while (num > 0) {
//            count++;
//            num /= 10;
//        }
//        return count;
//    }
    static boolean isEven(int num) {
        int numOfDigits = digits2(num);
        return (numOfDigits % 2 == 0);
    }
    static int evenLength(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (isEven(num)) {
                count++;
            }
        }
        return count;
    }
}

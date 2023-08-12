public class NumberPalindrome {
    public static boolean isPalindrome(int number) {
        int intialNumber = number;
        int reverseNumber = 0;
        while (number != 0) {
            reverseNumber *= 10;
            reverseNumber = reverseNumber + (number % 10);
            number /= 10;
//            if (number % 10 == 0) {
//                break;
//            }

        }
        return intialNumber == reverseNumber;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(101));
    }
}

public class FirstAndLastDigitSum {
    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;
        } else {
            int lastDigit = number % 10;
            while (number / 10 != 0) {
                number /= 10;
            }
            return number + lastDigit;
        }
    }

    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(123456789));
    }
}

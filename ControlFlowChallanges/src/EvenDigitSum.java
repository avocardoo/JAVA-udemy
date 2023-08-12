public class EvenDigitSum {
    public static int getEvenDigitSum(int number) {
        if (number < 0) {
            return -1;
        } else {
            int sumOfEvenDigit = 0;
            while(number > 0) {
                int singleNumber = number % 10;
                if (singleNumber % 2 == 0) {
                    sumOfEvenDigit += singleNumber;
                }
                number /= 10;
            }
            return sumOfEvenDigit;
        }
    }

    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(2000));
    }
}

public class PerfectNumber {
    public static boolean isPerfectSquare(int number) {
        if (number < 1) {
            return false;
        } else {
            int i = 1;
            int sum = 0;
            while (i < number) {
                if (number % i == 0) {
                    sum += i;
                }
                i++;
            }
            return (sum == number);
        }
    }

    public static void main(String[] args) {
        System.out.println(isPerfectSquare(-1));
    }
}

public class Prime {
    public static void main(String[] args) {
        System.out.println(isPrime(101));
    }
    public static boolean isPrime(int wholeNumber) {
        if (wholeNumber <= 2) {
            return false;
        }
        for (int divisor = 2; divisor < wholeNumber/2; divisor++){
            if (wholeNumber % divisor == 0) {
                return false;
            } else {
                return true;
            }
        }
        return true;
    }
}
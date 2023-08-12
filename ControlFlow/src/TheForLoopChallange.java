public class TheForLoopChallange {
    //    public static void main(String[] args) {
//        isPrime(25);
//    }
//    public static void isPrime(int wholeNumber) {
//        if (wholeNumber > 2 && wholeNumber <= 1000) {
//            for (int divisor = 2; divisor <= wholeNumber / 2; divisor++) {
//                int primeNumberCounter = 0;
//                if (wholeNumber % divisor == 0) {
//                    break;
//                } else {
//                    System.out.println(wholeNumber);
//                    primeNumberCounter++;
//                }
//                if (primeNumberCounter > 3){
//                    break;
//                }
//            }
//        } else {
//            System.out.println("Input out of Bound");
//        }
//    }
    public static void main(String[] args) {
        int count = 0;
        for (int i = 10; count < 3 && i <= 50; i++) {
            if (isPrime(i)) {
                System.out.println("Number " + i + " is a prime number");
                count++;
            }
        }
    }

    public static boolean isPrime(int wholeNumber) {
        if (wholeNumber <= 2) {
            return (wholeNumber == 2);
        }
        for (int divisor = 2; divisor <= wholeNumber / 2; divisor++) {
            if (wholeNumber % divisor == 0) {
                return false;
            } else {
                return true;
            }
        }
        return true;
    }
}

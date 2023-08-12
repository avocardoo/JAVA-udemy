import java.util.HashMap;

public class TheForLoop {

//    public static void main(String[] args) {
//        for (double rate = 2.0; rate <= 5; rate++) {
//            double interestAmount = calculateInterest(10_000, rate);
//            System.out.println("The interest at " + rate + " on amount 10,000 is " + interestAmount);
//        }
//    }
//    public static double calculateInterest(double amount, double interestRate) {
//        return (amount * (interestRate / 100));
//    }
    public static double calculateInterestMethod(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }

    public static void main(String[] args) {
        for (double i = 7.5; i <= 10.0; i += 0.25) {
            double interestAmount = calculateInterestMethod(100, i);
            if (interestAmount > 8.5) {
                break;
            }
            System.out.println("Your interest on the amount of $100 is $" + interestAmount);
        }
    }
}
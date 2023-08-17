import java.util.InputMismatchException;
import java.util.Scanner;

public class InputCalculator {

    public static void inputThenPrintSumAndAverage() {
        int count = 0;
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                int number = scanner.nextInt();
                sum += number;
                count++;
            } catch (NumberFormatException nfe) {
                break;
            }
            int avg = sum / count;
            System.out.println("SUM = " + sum + " AVG = " + avg);
            break;
        }
    }

    public static void main(String[] args) {
        inputThenPrintSumAndAverage();

    }

}

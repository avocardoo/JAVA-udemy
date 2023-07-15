import java.util.Scanner;

public class PoundtoKg {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the weight: ");
        double weight = in.nextDouble();
        double kilo = weight * 0.45359237;

        System.out.println("The weight in kg is " + kilo + " kg");
    }
}

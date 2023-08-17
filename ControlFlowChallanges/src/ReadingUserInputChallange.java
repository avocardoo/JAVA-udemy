import java.util.Scanner;

public class ReadingUserInputChallange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 1;
        double sum = 0;
//        while (counter <= 5) {
//            System.out.print("Enter number # " + counter + " ");
//            String input = scanner.nextLine();
//            try {
//                //to convert string to double
//                double stringToNum = Double.parseDouble(input);
//                sum += stringToNum;
//                counter++;
//            } catch (NumberFormatException nfe) {
//                System.out.println("Invalid Number");
//            }
        do {
            System.out.print("Enter number # " + counter + " ");
            String input = scanner.nextLine();
            try {
                //to convert string to double
                double stringToNum = Double.parseDouble(input);
                sum += stringToNum;
                counter++;
            } catch (NumberFormatException nfe) {
                System.out.println("Invalid Number");
            }



        } while (counter <= 5);
        System.out.println("The sum of the numbers is " + sum);
    }
}

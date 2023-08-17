import java.util.Scanner;

public class InputThroughScanner {
    public static void main(String[] args) {
        int currentYear = 2023;
        Scanner scanner = new Scanner(System.in);
    }
    public static int checkData(int currentYear, String dateOfBirth) {
        int dob = Integer.parseInt(dateOfBirth);
        int minimumYear = currentYear - 125;

        if(dob < minimumYear || dob < currentYear) return -1;
        return (currentYear - dob);
    }

}

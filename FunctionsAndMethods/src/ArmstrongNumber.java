import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter a number: ");
//        int num = sc.nextInt();
//        System.out.println(isArmstrong(num));
        for (int i = 100; i < 1000; i++) {
            if(isArmstrong(i)) {
                System.out.print(i + " ");
            }

        }
    }

    private static boolean isArmstrong(int num) {
        int orginal = num;
        int cubeSum = 0;
        while(num > 0) {
            int temp = num % 10;
            cubeSum += temp*temp*temp;
            num = num / 10;
        }
        return orginal == cubeSum;
    }
}

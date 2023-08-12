public class LastDigitChecker {
    public static boolean hasSameLastDigit(int num1, int num2, int num3) {
        if (num1 >= 10 && num1 <= 1000 && num2 >= 10 && num2 <= 1000 && num3 >= 10 && num3 <= 1000 ) {
            int temp1 = num1 % 10;
            int temp2 = num2 % 10;
            int temp3 = num3 % 10;

            return temp1 == temp2 || temp2 == temp3 || temp1 == temp3;
        } else return false;
    }
    public static boolean isValid(int num) {
        return (num >= 10 && num <= 1000);
    }

    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(12, 23, 22));
    }

}

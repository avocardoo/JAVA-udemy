public class SharedDigit {
    public static boolean hasSharedDigit(int num1, int num2) {
        if (num1 >= 10 && num1 <= 99 && num2 >= 10 && num2 <= 99) {

            int temp1 = num1 % 10;
            num1 /= 10;
            int temp2 = num2 % 10;
            num2 /= 10;

            if (temp1 == temp2 || temp1 == num2 || num1 == temp2 || num1 == num2) {
                return true;
            } else {
                return false;
            }

        } else {
            return false;
        }
    }
}

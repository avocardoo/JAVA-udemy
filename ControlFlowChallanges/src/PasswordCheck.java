public class PasswordCheck {
    public static String checkPassword(String password, int length, int minSize) {
        if (length >= minSize) {

        } else return "Invalid";
        }
    }

    public static int countDigit(int number) {
        int count = 0;
        while (number != 0) {
            number /= 10;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countDigit(7412589));
    }
}

public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double num1 , double num2){
        float fnum1 = ((int) num1 * 100) / 100;
        float fnum2 = ((int) num2 * 100) / 100;

        if (fnum1 % 100 == (double) fnum2 % 100){
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(-3.1756, -3.175));
    }
}

public class Swap {
    public static void main(String[] args) {
        int a = 12;
        int b = 31;
        swapTwoNumbers(a, b);
    }

    private static void swapTwoNumbers(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}

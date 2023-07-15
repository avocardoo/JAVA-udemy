public class PrimitiveTypesChallange {
    public static void main(String[] args) {
        System.out.println("Byte range " + Byte.MAX_VALUE + ", " + Byte.MAX_VALUE);
        System.out.println("Short range " + Short.MAX_VALUE + ", " + Short.MAX_VALUE);
        System.out.println("Integer range " + Integer.MAX_VALUE + ", " + Integer.MAX_VALUE);

        byte firstVar = 56;
        short secondVar = 12354;
        int thirdVar = 784531;
        int sum = firstVar + secondVar + thirdVar;
        //long forthVar = 50000L + 10L * sum;
        //System.out.println(forthVar);
        short forthVar = (short) (10000L + 10L * sum);

    }
}

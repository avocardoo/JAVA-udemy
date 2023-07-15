public class Casting {
    public static void main(String[] args) {
        System.out.println(Short.MIN_VALUE);
        System.out.println(Integer.MIN_VALUE);

        byte myMinValue = Byte.MIN_VALUE, myMaxValue = Byte.MAX_VALUE;
        System.out.println(myMinValue);
        System.out.println(myMaxValue);

        System.out.println(Integer.MIN_VALUE / 2);
        byte myNewByte = (int) Byte.MIN_VALUE / 2;
        System.out.println(myNewByte);
    }
}

public class Challange1 {
    public static void main(String[] args) {
        double var1 = 20.00d, var2 = 80.00d;
        System.out.println("variable 1 is " + var1);
        System.out.println("variable 2 is " + var2);
        double var3 = (var1 + var2) * 100.00d;
        System.out.println("Step 3 = " + var3);

        double rem = var3 % 40.00d;
        System.out.println("Remainder is " + rem);

        boolean var4 = (rem == 0.00) ? true : false;
        System.out.println("The boolean value is " + var4);

        if (var4 != true){
            System.out.println("got some remainder");
        }

    }
}

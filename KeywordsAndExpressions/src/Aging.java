public class Aging {
    public static boolean isTooYoung(int age){
        boolean result = false;
        if (age < 21){
            result = true;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("The boy is and eligible voter" + isTooYoung(12));
    }
}

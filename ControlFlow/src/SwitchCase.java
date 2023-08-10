public class SwitchCase {
    public static void main(String[] args) {
        int switchValue = 1;
        switch (switchValue) {
            case 1:
                System.out.println("The value was 1");
                break;
            case 2:
                System.out.println("The value was 2");
                break;
            case 3: case 4: case 5:
                System.out.println("was a 3, 4, 5");
                break;
            default:
                System.out.println("The value was not 1 or 2");
        }
    }
}

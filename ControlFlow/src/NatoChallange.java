public class NatoChallange {
    public static void main(String[] args) {
        char secretCode = 'c';
        switch (secretCode) {
            case 'a' -> System.out.println("Able");
            case 'b' -> System.out.println("Baker");
            case 'c' -> System.out.println("Chalie");
            case 'd' -> System.out.println("Dog");
            case 'e' -> System.out.println("Easy");
            default -> System.out.println("not found");
        }
    }
}

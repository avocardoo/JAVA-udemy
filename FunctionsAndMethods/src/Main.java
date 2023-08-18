import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        String personalizedGreet = greet(name);
        System.out.println(personalizedGreet);
    }

    private static String greet(String name) {
        String message = "Hello " + name;
        return message;
    }

}
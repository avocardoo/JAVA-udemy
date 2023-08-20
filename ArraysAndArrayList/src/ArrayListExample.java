import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        //Syntax
        ArrayList<Integer> list = new ArrayList<>(10);
//        list.add(78);
//        list.add(105);
//        list.add(458);
//        list.add(85);
//        list.add(45);
//        list.add(98);
//
//        System.out.println(list.contains(105));
//        System.out.println(list);
//        list.set(3, 1050);
//        list.remove(2);
//        System.out.println(list);

        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
        }

        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i));
        }
        System.out.println(list);

    }
}

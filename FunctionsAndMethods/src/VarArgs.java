import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun(2, 43, "asad", "dasd", "daswda");
    }
    static void fun(int a, int b, String ...v) {
        System.out.println(Arrays.toString(v));

    }
}

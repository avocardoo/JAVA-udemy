public class NumberExampleRecursion {
    public static void main(String[] args) {
        print(1);
    }
    static void print(int n) {
        //base condition
        if (n == 5) {
            System.out.println(n);
            return;
        }
        System.out.println(n);
        //recursive call
        //if you are calling a function again and again, you can treat it as a seprate call in the stack
        print(n + 1);
    }
}

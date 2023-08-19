public class Experimenting {
    public static void main(String[] args) {


        int a = 57;
        int b = 36;
        {
            a = 100;
        }
        System.out.println(a);
        //will be printing 100 as the original value has been changed
    }
}

public class AreaCalculator {
    public static double Area(double radius){
        if (radius < 0){
            return -1.0;
        } else {
            return radius * radius * Math.PI;
        }
    }
    public static double Area(double x, double y){
        if (x < 0 || y < 0){
            return -1.0;
        } else {
            return x * y;
        }
    }

    public static void main(String[] args) {
        System.out.println(Area(-1));
        System.out.println(Area(5.0, 4.0));
    }
}

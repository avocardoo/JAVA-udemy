public class SpeedConverter{
    public static long toMilesPerHour(double kilometersPerHour) {
        long milesPerHour;
        if (kilometersPerHour < 0) {
            return -1;
            //to indicate and invalid value
        } else {
            milesPerHour = (long) (kilometersPerHour / 1.609);
        }
        return Math.round(milesPerHour);

    }

    public static void printConversion(double kilometersPerHour){
        if (kilometersPerHour < 0){
            System.out.println("Invalid value");
        } else {
            double milesPerHour = ((kilometersPerHour) / 1.609);
            System.out.println(kilometersPerHour + " km/h = " + Math.round(milesPerHour) + " mi/h" );
        }
    }

    public static void main(String[] args) {
        printConversion(55.75);
        System.out.println(toMilesPerHour(55.75));
    }
}
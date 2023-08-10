public class DayOfTheWeekChallange {
    public static void printDayOfWeek(int day) {
        String dayOfWeek = switch(day) {
            case 0 -> {yield "Sunday";}
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            default -> {yield "Invalid Day";}
        };
        System.out.println(day + " stands for " + dayOfWeek);
    }

    public static void main(String[] args) {
        printWeekDay(3);
        printWeekDay(-238);
    }
    public static void printWeekDay(int day){
        if (day > 0){
            if (day == 0){
                System.out.println("Sunday");
            } else if (day == 1) {
                System.out.println("Monday");
            } else if (day == 2) {
                System.out.println("Tuesday");
            } else if (day == 3) {
                System.out.println("Wednesday");
            } else if (day == 4) {
                System.out.println("Thursday");
            } else if (day == 5) {
                System.out.println("Friday");
            } else if (day == 6) {
                System.out.println("Saturday");
            } else {
                System.out.println("Invalid Value");
            }
        } else {
            System.out.println("Invalid input");
        }

    }
}

public class SecondsAndMinutes {
    public static String getDurationString(int seconds) {
        String timeInMinutes;
        if (seconds >= 0) {
            int minutes = seconds / 60;
            int remSeconds = seconds % 60;
            timeInMinutes = getDurationString(minutes, remSeconds);
        } else {
            timeInMinutes = "Invalid seconds";
        }
        return timeInMinutes;
    }
    public static String getDurationString(int minutes, int seconds) {
        String timeInHours;
        if (minutes >= 0 && seconds >= 0) {
            int hours = minutes / 24;
            int remMinutes = minutes % 24;
            timeInHours = hours + "h " + remMinutes + "m " + seconds + "s ";
        } else {
            timeInHours = "Invalid input";
        }
        return timeInHours;
    }

    public static void main(String[] args) {
        System.out.println(getDurationString(3654128));
    }
}

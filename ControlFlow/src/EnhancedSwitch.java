public class EnhancedSwitch {
    public static String whichQuater(String month) {
        return switch (month){
        case "JANUARY", "FEBUARY", "MARCH" -> {yield "1st";}
            case "APRIL", "MAY", "JUNE" -> "2nd";
        case "JULY", "AUGUST", "SEPTEMBER" -> "3rd";
        case "OCTOBER", "NOVEMBER", "DECEMBER" -> "4th";
            default -> {
            String badResponse = month + " isbad";
            yield badResponse;
            }
        };
    }

    public static void main(String[] args) {
        System.out.println(whichQuater("HNFDHCSAH"));
    }
}

public class HeightMethodOverloading {
    public static double convertToCentimenters(int heightInches){
        return heightInches * 2.54;
    }
    public static double convertToCentimeters(int heightFeet, int heightInches){
        int totalInches = (heightFeet * 12) + heightInches;
        double result = convertToCentimenters(totalInches);
        return result;
    }

    public static void main(String[] args) {
        System.out.println(convertToCentimeters(5, 3));
    }
}

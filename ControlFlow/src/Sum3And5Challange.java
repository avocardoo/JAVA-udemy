public class Sum3And5Challange {
    public static void main(String[] args) {
        int sumOfAllMatches = 0;
        int countOfMatches = 0;
        for (int i = 1;countOfMatches < 5 && i < 1000; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("Here is a common divident of " + i);
                countOfMatches++;
                sumOfAllMatches += i;
            }
        }
        System.out.println("The sum of all these 5 number is " + sumOfAllMatches);
    }
}

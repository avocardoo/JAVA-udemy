public class Main {
    public static int calculateScore(String playerName, int score){
        System.out.println("Player " + playerName + " scored " + score);
        return score * 1000;
    }
    public static int calculateScore(int score){
        System.out.println("The best player scored " + score);
        return score * 1000;
    }

    public static int calculateScore(){
        System.out.println("No player played, hence no score");
        return 0;
    }

    public static void main(String[] args) {
        int newScore = calculateScore("Ram", 500);
        System.out.println("New score is " + newScore);

        calculateScore(75);
        System.out.println(calculateScore());
    }
}
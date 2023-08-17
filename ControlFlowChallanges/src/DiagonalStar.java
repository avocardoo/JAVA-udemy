public class DiagonalStar {
    public static void printSquareStar(int number) {
        if (number < 5) {
            System.out.println("Invalid Value");
        }
        for (int row = 0; row < number; row++) {
            for (int column = 0; column < number; column++) {
                if (row == 0 || row == number-1 || column == 0 || column == number-1 || column == row || column == number-1-row) {
                    System.out.print("*");
                } else System.out.print(" ");
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        printSquareStar(5);
    }
}

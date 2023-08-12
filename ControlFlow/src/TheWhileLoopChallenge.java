public class TheWhileLoopChallenge {
    public static boolean isEvenNumber(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int number = 5;
        int finishNumber = 20;
        int evenCount = 0;
        int oddCount = 0;
        while (number <= finishNumber) {
            number++;
            if (evenCount >= 5) {
                break;
            }
            if (isEvenNumber(number)){
                System.out.println(number);
                evenCount += 1;
            } else {
                oddCount += 1;
            }
        }
        System.out.println("Total even number are " + evenCount);
        System.out.println("Total odd number are " + oddCount);

    }
}

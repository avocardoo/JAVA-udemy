public class NumberToWords {
    public static void numberToWords(int number) {
        int reverseNumber = reverse(number);
        if (reverseNumber == 0) {
            System.out.println("Zero");
        }
        if (reverseNumber < 0) {
            System.out.println("Invalid Value");
        }
        int safeNumber = reverseNumber;

        int word = 0;
        while (reverseNumber != 0) {
            word = reverseNumber % 10;
            reverseNumber /= 10;
            if (word == 0) {
                System.out.println("Zero");
            } else if (word == 1) {
                System.out.println("One");
            } else if (word == 2) {
                System.out.println("Two");
            } else if (word == 3) {
                System.out.println("Three");
            } else if (word == 4) {
                System.out.println("Four");
            } else if (word == 5) {
                System.out.println("Five");
            } else if (word == 6) {
                System.out.println("Six");
            } else if (word == 7) {
                System.out.println("Seven");
            } else if (word == 8) {
                System.out.println("Eight");
            } else if (word == 9) {
                System.out.println("Nine");
            }
        }
        int count1 = getDigitCount(number);
        int count2 = getDigitCount(safeNumber);
        if (count1 != count2) {
            count1 -= count2;
            for (int i = 0; i < count1; i++) {
                System.out.println("Zero");
            }
        }
    }
    public static int reverse(int number){
        if (number == 0) return 0;
        int reverseNumber = 0;
        while (number != 0) {
//            reverseNumber *= 10;
            reverseNumber = (reverseNumber * 10) + (number % 10);
            number /= 10;
        }
        return reverseNumber;
    }
    public static int getDigitCount(int number) {
        if (number < 0) return -1;
        if (number == 0) {
            return 1;
        }
        int count = 0;
        int dummyNumber = 0;
        while (number != 0) {
            int dumbNumber = number % 10;
            count++;
            number /= 10;
        }
        return count;
    }

    public static void main(String[] args) {
        numberToWords(0);

    }
}

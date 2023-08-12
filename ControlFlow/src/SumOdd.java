public class SumOdd {
    public static boolean isOdd(int number) {
        if (number > 0) {
            if (number % 2 != 0) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
    public static int sumOdd(int start, int end) {
        if (end >= start && start > 0 && end > 0) {
            int sumOfOddNumbers = 0;
            for (int i = start; i <= end; i++) {
                if (i % 2 != 0) {
                    System.out.println(i);
                    sumOfOddNumbers += i;
                }
            }
            isOdd(sumOfOddNumbers);
            return sumOfOddNumbers;
        } else {
            return -1;
        }
    }
}

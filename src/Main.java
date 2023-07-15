public class Main {
    public static void main(String[] args) {
        int myFirstNum = 5, mySecondNum = 12, myThirdNum = 6;
        System.out.println(myFirstNum + mySecondNum + myThirdNum);
        myThirdNum = myFirstNum * 2;
        System.out.println(myFirstNum + mySecondNum + myThirdNum);
        int myLastValue = 1000-(myFirstNum + mySecondNum + myThirdNum);
        System.out.println(myLastValue);

    }
}
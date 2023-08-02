package com.Hello;

public class hello {
    public static void main(String[] args){
//        System.out.println("Hello, Tim");
//
//        boolean isAlien = false;
//        if (!isAlien) {
//            System.out.println("It is not an alien");
//            System.out.println("And I am scared of alien");
//        }
//        int topScore =  80;
//        if (topScore <= 100){
//            System.out.println("You got the high score!");
//        }
//
//        int secondTopScore = 81;
//        if ((topScore > secondTopScore) && (topScore < 100)){
//            System.out.println("Greater than second top score but less than 100");
//        }
//
//        if ((topScore > 90) || (secondTopScore <=90)){
//            System.out.println("Either or both the conditions are true");
//        }
//
//        int newValue = 50;
//        if (newValue == 50){
//            System.out.println("This is an error!");
//        }
//
//        Boolean isCar = false;
//        if (!isCar){
//            System.out.println("This is not supposed to happen");
//        }

        String makeOfCar = "Volkswagen";
        //boolean isDomestic = (makeOfCar == "Volkswagen") ? false : true;
        boolean isDomestic = (makeOfCar != "Volkswagen");
        if (isDomestic){
            System.out.println("This car is Domestic to our market");
        }
        else {
            System.out.println("This car is imported");
        }

        int ageOfClient = 20;
        String ageText = (ageOfClient >= 18) ? "Over Eighteen" : "Still a kid";
        System.out.println("The client is " + ageText);
    }
}


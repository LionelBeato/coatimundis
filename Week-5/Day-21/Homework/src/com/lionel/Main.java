package com.lionel;

public class Main {

     static void gulpChecker( int gulps){
        if (gulps > 5){
            System.out.println("Your fish gulps a lot!");
        } else {
            System.out.println("I think your fish is dead.");
        }
    }

    public static void main(String[] args) {

        Fish myFish = new Fish(7, 4);
        gulpChecker(myFish.getNumOfGulps());

    }
}

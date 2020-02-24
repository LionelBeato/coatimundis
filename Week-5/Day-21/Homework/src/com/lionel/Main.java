package com.lionel;

import java.util.Arrays;

public class Main {


     static void gulpChecker( int gulps){
        if (gulps > 5){
            System.out.println("Your fish gulps a lot!");
        } else {
            System.out.println("I think your fish is dead.");
        }
    }

    public static void main(String[] args) {


        // declaring an array of integers
        int numArr[] = {3, 2, 4, 6};

        // sneak peek of functional programming in Java! Note the .stream() syntax and arrow notation!
        Arrays.stream(numArr)
                .map(num -> num + 3)
                .forEach(System.out::println);
        





        Fish myFish = new Fish(7, 4);
        gulpChecker(myFish.getNumOfGulps());

    }
}

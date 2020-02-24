package com.lionel;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        boolean gameisPlaying = true;
        String answer;

        while (gameisPlaying) {
            System.out.println("Give me a number between 1 and 100: ");
            int rand = (int)((Math.random() * (100 - 1) + 1));
            int guess = input.nextInt();
            System.out.println(rand);


            if (guess == rand) {
                System.out.println("The guessed number and random number are the same!");
                System.out.println("Play again?");
            } else if (guess > rand - 10 && guess < rand + 10) {
                System.out.println("Oooooh, Soo close!");
                System.out.println("Play again?");
            } else if (guess > rand) {
                System.out.println("The guessed number is too high!");
                System.out.println("Play again?");
            } else if (guess < rand) {
                System.out.println("The guessed number is too low!");
                System.out.println("Play again?");
            }
            answer = input.next();

            if (answer == "yes"){
                continue;
            } else {
                System.out.println("Thank you for playing!");
                gameisPlaying = false;
            }


        }
    }
}

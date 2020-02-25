package com.lionel;
import java.util.Scanner;

public class Main {

    static void animalChecker(Animal a){
       if (a instanceof Animal){
           System.out.println(a.speak());
       } else {
           System.out.println("That is not an animal");
       }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Cat garfield = new Cat();
        Dog brian = new Dog();
        Animal myAnimal = new Animal();

        animalChecker(myAnimal);


    }
}

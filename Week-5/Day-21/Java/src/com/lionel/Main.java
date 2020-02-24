package com.lionel;
import java.util.Scanner;



public class Main {


    // lets break down what this all means
    // public is an access modifier, it allows other programs to see main
    // static means the method or variable is of the class and not of the instance
    // void means that this method doesn't return anything
    // main tells Java that this method is your entry point
    // String args[] is the parameter of your main method
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // note the lack of "println" and the \n notation to create a linebreak
        System.out.print("Hello World!\n");
//        System.out.print("My name is Lionel.\n");

        // formatting in Java, note that the s refers to string
        System.out.printf("My name is %s", "Lionel");

        // this is a primitive, it's a direct access to a datum value
        int x = 4;
        // here are all of the data types for java
        // byte, small data type that takes up to 8 bits
        // short, small number thats up to 16 bits
        // int, most commonly used primitive that takes up 32 bits
        // long, data type for large numbers that takes up 64 bits
        // double, data type for very long decimal values that takes up 64 bits
        // char, data types for characters that take up 16 bits
        // boolean, data type for checking true/false that takes up one bit

        // this is a reference, it's a pointer to another location in memory that represents the given value
        String str = "This is a string!";
        // Class, which is is the basic OOP building block of Java
        // Annotation, which provides metadata
        // Array, fixed data structure that stores elements of the same type
        // Enumeration, a reference for set of objects that represents a related set of choices
        // Interface, provides a public API that is implemented by classes

        // whenever you see a variable in an oject, it's called a field
        // whenever you see a function in an object, it's called a method

//        System.out.println("What is your name?");
//        String firstName = input.nextLine();
//        System.out.printf("Hello %s!\n", firstName);

        // mad libs assignment
        System.out.println("Input a noun: ");
        String noun = input.nextLine();
        System.out.println("Input an adjective: ");
        String adj = input.nextLine();
        System.out.println("Input a verb: ");
        String verb = input.nextLine();

        System.out.printf("The %s %s likes to %s!", adj, noun, verb);
    }
}

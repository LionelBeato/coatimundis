package Review;

import java.util.ArrayList;
import java.util.List;

public class Review {

    /* This is our Java Review! */

    // Encapsulation is the mechanism of wrapping data and code acting on the data together as a single unit.
    // Abstraction is hiding the implementation details from the user
    // Inheritance is the mechanism in which one objects inherits properties of a parent object
    // Polymorphism is a process in whih we can perform the same action in different ways

    // There are two major data types in Java
    // primitives and non-primitives

    // primitive types are
    // boolean, char, byte, short, int, long, float, double
    // major difference amongst them is the byte value

    // non primitives include:
    // Arrays, Classes, Interfaces

    // Our main method, or entrypoint, is considered a THREAD
    // a THREAD is considered a "thread of execution"
    // "thread of execution" is the smallest sequence of programmed instructions
    public static void main(String[] args) {

        // statements are instructions that tell the language what to do
        // almost every statement needs to have its type declared
        // you need to be explicit with the typing
        // an expression is a construct mode up of code and operators and method invocation
        // typically, items to the right of the equals sign is the expression

        // x in this statement would be considered a variable
        // a variable is peice of memory that can contain a data value
        int x = 3 + 1;

        // the four major variable types are as followed:
        // instance variables (non static fields) have value unique to each instance
        // class variables (static fields) are unique to the class and exist in only one state
        // local variables are values specific to a method's temporary state
        // parameters are values that you can pass to a method

        // there are multiples ways to declare an array
        int[] intArray = new int[3];
        int otherArray[] = {1, 2, 3, 4, 5};
        int[] lastArray = new int[]{1, 2, 3};

        // ArrayLists are all pretty much declared the same way
        // Note the generic typing
        ArrayList<Integer> arrayList = new ArrayList<>();
        // Note that ArrayLists can be declared with the interface "List"
        List<Integer> otherList = new ArrayList<>();
        
    }


}

package Review;

import java.util.HashMap;
import java.util.Collections;
import java.util.Vector;

public class Review {

    public static int myMethod(int x){
        System.out.println(x);
        if (x == 1) return 1;
        return myMethod(x-1);
    }

    public static void main(String[] args) {

        // Java objects can have fields and methods
        // methods defines behavior and fields define properties

        // you can create as many objects from a class as you want

        MyClass myObject = new MyClass(3);
        MyClass myOtherObject = new MyClass(2);
        MyClass myOtherOtherObject = new MyClass(1);

        // constructors help you initialize the fields in objects

        // creating a variable is known as "declaring" a variable
        // variable names are known as identifiers
        // so "myObject" is technically an identifier

        // what does the String class manage?
        // strings are technically a sequence of characters

        String myString = "This is my string!";
        System.out.println(myString.length());

        // string stuff
        // substring can help you get a portion of a string
        System.out.println(myString.substring(0,4));

        // toLowerCase is also available
        System.out.println(myString.toLowerCase());


        // loops and conditionals

        // if statements
        // else if statements
        // for loops
        // for loops have a declaration, breakpoint, and iteration in parans
        for (int i = 0; i < 5; i++){
            System.out.println("I'm inside a for loop!");
        }

        // enhanced for loops
        int[] ints = {1, 2, 3};

        System.out.println("This is an enhanced for loop, it's iterating through a defined array:");
        for (int item:ints) {
            System.out.println(item);

        }

        // while loops

        // arrays
        // default value and syntax

        // you can declare an array as empty
        // if you try to access an element however, it'll throw an error

        int[] myInts = {};
//        System.out.println(myInts[0]);

        // binary tree recursion
        // binary tree operations involve recursion

        // recursion definition and sample
        // recursion means that a method will call itself

        System.out.println("This is a recursive method call: ");
        myMethod(5);


        // base case
        // a base is a condition that does not have a recursive call
        // in myMethod(5), the if statement that checks for 1 was our base case
        // if you dont have a base case, an infinite loop occurs

        // binary search looks in the middle of the array/collection
        // ** binary search needs the array to be sorted
        // ** merge sort is recursive


        // map provides k,v pairs
        // k, v means key value pairs

        HashMap<Integer, String> myMap = new HashMap<Integer, String>();
        myMap.put(1, "Item-1");
        myMap.put(2, "Item-2");

        // you can print out a hashmap value to see whats inside it
        System.out.println("This is my hashmap: ");
        System.out.println(myMap);



        // one important thing to note is that generic types only accept wrappers and classes
        // ** arraylist - generics ensure type checking
        // types will be checked at compile time to ensure type-safety
        // they can grow dynamically

        // ** interestingly enough, Group is not part of the Collections framework

        // ** vector
        // we didn't cover vectors but they work similarly to other data types
        // ** enumeration is fail-safe
        // this means enumeration won't throw an error when iterating and values are altered
        // ** iterator is fail-fast
        // this means it will throw an error if values are altered

        Vector newVector = new Vector();
        newVector.add(4);
        newVector.add(3);

        System.out.println("This is my vector: ");
        System.out.println(newVector);

        // ** JDBC is an API to access relational databases, spreadsheets and flat files
        // flat files refers to text databases

        // statements in jdbc
        // ** use prepared statement for parametertized queries
        // PreparedStatement is the specific class

        // ** strictly speaking, A DataSource is a factory of connections to a physical data source

        // ** JDBC reuses connections, thus creating a "connection pool"
        // ** this allows for better performance

        // ** you can use rollback() to undo a transaction










    }

}

package Lesson;

import Lesson.Factory.*;
import Lesson.Singleton.LazyInitSingleton;
import Lesson.Singleton.StaticBlockSingleton;

public class Lesson {

    // Design Patterns

    // In OOP there are a few major standards of structuring your data
    // we call these standards design patterns
    // it's an industry-standard approach to solving a recurring problem
    // this allows you to work smart, not hard
    // design patterns lead to more robust and maintable code
    // thus, reducing the total cost of ownership (TCO)
    // it's easier to develop for and to debug


    public static void main(String[] args) {


        // singleton pattern
        // this pattern restricts the instantiation of a class and ensures
        // that only one instance of that class exists

        StaticBlockSingleton.getInstance();
        LazyInitSingleton.getInstance();


        // factory pattern
        // abstract factory pattern


        // observer pattern

        // observer is a behavior design pattern
        // it specifies the communication between objects: observable and observers
        // an observable is an object which notifies observers about the changes in its state

        // decorator pattern
        // the purpose of the decorator is to wrap a target object so
        // that you can dynamically add new responsibilities at runtime.


        // building a new computer with my factory
        Computer myPC = ComputerFactory.getComputer("PC", "16GBDDR4", "1TB", "i7");

        System.out.println(myPC.toString());


    }
}

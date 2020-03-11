package Lesson;

import Lesson.Factory.Computer;
import Lesson.Factory.ComputerFactory;
import Lesson.Factory.PC;
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
        // decorator pattern

        // building a new computer with my factory
        Computer myPC = ComputerFactory.getComputer("PC", "16GBDDR4", "1TB", "i7");

        System.out.println(myPC.toString());

    }
}

// this declaration tells where this java class lives
// it tells us what package it belong to

// there's one package that's *ALWAYS* imported implicitly
// that package is Java.lang

package Lesson;
// you can manually import this user defined package
// but the IDE will typically take care of the import for you
import OtherPackage.CodeThatINeed;
// these are explicit packages that are built into the JAVA API

import java.util.ArrayList;
import java.util.List;

public class Lesson {

    // Packaging Code

    // what does it mean to package code?

    // Packaging code is pretty much a way to organize your code
    // there are two types of packages
    // there are built in packages
    // and there are user-defined packages

    public static void main(String[] args) {

        // in order for our integer list to work, we always need to import
        List<Integer> integerList = new ArrayList<>();
        System.out.println("This program works!");

        // there are packages and classes with the same
        // it'll be up to you to determine the correct import
        // the IDE is pretty smart, so 7/10 you can rely on it
        // as you continue using it, the IDE should get better at guessing your imports

        // now I want to import from my userdefined package
        System.out.println("This value comes from a custom package: "+CodeThatINeed.valueThatINeed);


        // ultimately packages are just folders
        // don't over think it, they're pretty much there to hep you organize your code

        // it makes sense to group code that is doing similar things or have similar behavior


    }
}

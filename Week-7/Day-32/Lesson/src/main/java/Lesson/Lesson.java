package Lesson;

import java.io.IOException;
import java.security.GeneralSecurityException;

public class Lesson {

    // Java Exceptions

    // Exceptions are objects that are an instance of the class Throwable


    // in your code you an explicit state that a method will throw an exception
    public static void thisFails() throws Exception {
        System.out.println("Will this code be reached?");
    };


    // you can have a method throw more than one exception if you wanted to
    public static void main(String[] args) throws Exception, IOException, InstantiationException {


        // this is your typical try and catch block in Java
        // the code inside of the try block will be attempted
        // if that code throws an error, it wil be caught and the program will
        // run the code in the catch block
        try {
            int[] ints = {1, 2 , 3, 4};
            System.out.println(ints[10]);
            System.out.println("This code should never be reached!");
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("An error was caught!");
            e.printStackTrace();
        }


        // if you wanted to, you can chain catch blocks in your code
        // you would have to catch specific exceptions for each block

//        try{
//
//        } catch (SecurityException e){
//
//        } catch (IOException e) {
//
//        }


        // you can nest try blocks as deeply as you need
        // if you are aggressively nesting code blocks you may want to consider refactoring
        // I'm not entirely too sure of the use case but you can do this if you want

        try {
            try {
                try {

                } catch (Exception e) {

                }

            } catch (Exception e){

            }

        } catch (Exception e) {

        }


        try{
            System.out.println("In another try block");
            throw new CustomException();
//            System.out.println("This code will never be reached!");
        } catch (CustomException e){
            e.printStackTrace();
        } finally {
            System.out.println("This code will always be reached!");
        }


        // this exception is caught because we're explicitly throwing it
        // note that the main method has "throws" as well
        thisFails();






        System.out.println("This code resolved!");
    }
}

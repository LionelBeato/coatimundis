package Lesson;


public class Lesson {

    /* Java Methods */

    // methods can be described as functions tied to classes
    // you'll see it in reference to functions tied to objects

    // methods can be referred to as a collection of statements that are grouped together to operate

    // methods can be referred to by name
    // in Java, all methods have names

    public String returnString(){
        return "This is inside of a method as well!";
    }

    // "public static" is the modifier
    // "public" is an access modifier
    // "private" code cannot be accessed
    // "package-private" can only be accessed by package local code
    // "static' is a non-access modifier
    // "int" would be your return type
    // if you're not returning anything you would specify the return type of "void"
    // "returnInt" would be the method name
    // "()" would be your parameters
    // you pass in arguments inside your paramters (or as parameters)
    public static int returnInt(){
        // method body
        // this is where the method specific code will live
        // most method implementation will need statements in their bodies
        return 23;
    }

    // the name of the method and its parameters are referred to as its method signature
    public static int adder(int a, int b){
        // note that our parameters can be referred to in our method body
        // you don't need to utilize parameters that have been defined
        // note that a return statement is the value that the method give back
        // think of it as your output
        return a+b;
    }


    // overall, everything in Java that is a function is technically a method

    // main is a method
    // but since it is our entry point, you may hear it referred by other names
    // note that String[] args is the arguments that a user will pass in to the command line
    public static void main(String[] args) {


        // sout is also technically a method
        System.out.println("This is inside a method!");

        // take note that you can construct Lesson Object inside of the Lesson class
        Lesson lesson = new Lesson();

        // you will then be able to call the main method but this behavior may be undefined
        // lesson.main(strings)

        // you can call methods inside of a static context
        // you would just need to construct the object first
        System.out.println(lesson.returnString());

        System.out.println(returnInt());

        // constructing an object with a static variable
        Dog myDog = new Dog("Rover", 2);
        Dog otherDog = new Dog("Rover", 2);
        Dog yetAnotherDog = new Dog("Rover", 2);

        // note that the value of amountOfDogs changes according to how many dogs we constructed
        // this is it due to being a static variable that increments in the dog constructor
        System.out.println("Here is my amount of dogs: "+myDog.amountOfDogs);


        // whenever you utilize/invoke your method that is called "calling" the method
        // you can also say that you pass arguments into
        //
        //
        // your parameters
        System.out.println(adder(4,7));

        for (int i = 0; i < args.length; i++){
            System.out.println(args[i]);

        }
    }

}

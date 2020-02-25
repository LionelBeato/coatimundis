import java.util.ArrayList;
import java.util.List;

// while there are no true naming conventions in Java, Classes will always be PascalCased
public class Lesson {

    // variables can be declared in any block of code
    // the following variable cant be used unless Main is instantiated or the variable is turned static
    int gee;

    // this variable is static meaning that it belongs to the original instance of the class and cant be instantiated
    static int bee;


    void myMethod(){
        // this is a locally scoped block of code
        int x = 4;
        if (x > 3) {
            // this is another block of code
            for (int i = 0; i > 4; i++) {
                // this is yet another block of code
                // assume your variables are locally scopped and you should be okay
            }
        }
        System.out.println("hello");
    }

    // there is another case form called snake_case
    // this is not featured in Java, but you might see it in the wild

    // methods and variables will always be camelCased
    public static void main(String[] args) {

        // you can make a new instance of a class within that class
        // when it comes to Main, it's not best practice
        // however, I will be allowed to access my gee variable with newMain
        Main newMain = new Main();

        // primitive type has direct access to a value in memory
        // creating a variable like this is called a declaration
        int x = 3;
        // you can declare multiple variables on a single line but its not recommended
        int pop=0, top=0, can=0;

        // in Java you can declare variables without assigning values
        // typically, this is not best practice because it can lead to null pointer exceptions
        int z;
        // assigning a literal value is called initialization
        // variables can be initialized with other variables!
        z = 2;
        // using the variable z will throw a compiler error
//        System.out.println(z);
        // wrapper classes for primitives that give you helper methods
        Integer a = 4;
        // reference type is an indirect access to a value in memory
        String y = "my string";
        System.out.println("This works!");

        // casting
        // casting lets you override type checking but can cause errors
        // use this minimally, if you need to cast, it might be a code smell!
        int l = (int)6.0;

        // longs, floats, and doubles can be more declarative by adding a character at the end of their values
        long myLong = 230L;
        // floats
        float myFloat = 543.32f;
        // doubles
        double myDub = 34.434d;

        // java also supports increment and decrement symbols
        System.out.println(++l); // take note of the placement, this will be a 7
        System.out.println(l++); // this will be a 7 as well because its incremented after its printed to console


        // in java, the smaller variable type in memory will be casted to the biggest one
        double otherDub = 23.342d;
        float otherFloat = 34.4342f;

        System.out.println(otherDub+otherFloat);

        // logical operators
        // &&, ||, !

        // assignment operators
        // +=, -=, *=, /=, %=

        // binary operators
        int myNum = 50; // binary 0011 0010

        // there's really no right way to naming variables
        // just be aware that there are company and cultural standards
        String[] carArr = {"Volvo", "Toyota", "Ford"};

        // certain variables of certain types have a standard of being named
        // Objects immediately created for polymorphism purposes will use the identifier "o"
        // same with Exceptions
        Object o;
        Exception e;


        // Scope
        // don't think of variables in java in terms of global scope
        // try to limit scope to specific code blocks or local scope
        // code blocks will typically refer anything inside of { }


        // Wrappers
        // there's a wrapper class--or reference type--for every primitive
        // using wrappers can help us with operations, as they have useful helper methods

        // while you can use a constructor, it is now considered deprecated
        Integer myInt = new Integer(4);
        Integer otherInt = 4;
        // MIN_VALUE an MAX_VALUE are static constants in the Integer class
        // take note that constants are represented by all uppercase letters with underscores for spaces
        System.out.println(otherInt.MIN_VALUE);

        // wrapper classes can take in parsed strings as shown below
        Double newDub = Double.parseDouble("1302.43");
        // you can call the getClass() to check the type of reference for your wrapper class
        System.out.println(newDub.getClass());

        // boxing and unboxing
        List<Integer> myList = new ArrayList<>();

        myList.add(3);
        myList.add(2);

        // down here is an example of unboxing
        // this variable is a primitive that is being assigned to the value of a wrapper
        // java will understand what you're doing because of unboxing/boxing
        // this is expensive as an operation and should be avoided
        int n = myList.get(0);

        System.out.println(n);


        // Strings!
        // be aware that there's no reason why strings are classes, it's pretty much just a design decisions

        //strings can use a constructor
        String myString = new String("Hello");
        // but its easier to declare it like a primitive
        String otherString = "World";
        System.out.println(otherString.charAt(0));
        System.out.println(myString.concat(" ").concat(otherString));

        // StringBuilder class is recommended if you're manipulation with your string

        // Just like with printing, you can using string interpolation, or formatting
        String noun = "Mike";
        String verb = "dance";
        String thirdString = String.format("%s likes to %s.", noun, verb);
        System.out.println(thirdString);










    }
}

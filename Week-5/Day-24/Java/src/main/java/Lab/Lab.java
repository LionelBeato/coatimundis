package Lab;

import java.util.ArrayList;
import java.util.List;

public class Lab {

    public static void main(String[] args) {

        // 1. In a Java Project, create a block of code that will only work if a variable is set to `true`.
        // note the break statement; this is needed because it will otherwise be infinite!
        while(true){
            System.out.println("This is inside my while loop!");
            break;
        }

        //2. Create an Array (or List) and loop through that array using an enhanced for loop.
        // List interface is a more modern way of handling arrays and collections
        // note that it supports higher order functions
        List<Integer> numList = new ArrayList<>();
        numList.add(3);
        numList.add(4);
        numList.add(6);

        // this is the enhanced for loop, or "for each"
        // e-fors can be performed on any iterable object
        for(int item : numList){
            System.out.println(item);
        }
        
        // just for fun, we can use the more modern higher order functions to iterate
        // this is much cleaner and strongly encouraged 

        // anonymous functions--or lambdas--allow us to handle data in a more declarative, expressive way
        // it's neater and simpler as well!
        numList.stream() // open up a stream of data
                .map(item -> item+2) // maps the data to an anonymous function that returns the item plus 2
                .forEach(System.out::println); // prints for each datum

        // 3. Have a block of code that will execute inside of a do-while loop.
        // simple do block with a break statement to stop indefinite looping
        do {
            System.out.println("This is inside a do block!");
            break;
        } while (true);

        // 4. Write a switch statement with a default case.

        // declaring the value for my case
        String c = "good";

        // simple switch statement with three cases and a default
        switch(c){
            case "good":
                System.out.println("This is good");
            case "average":
                System.out.println("This is average");
            case "bad":
                System.out.println("This is bad");
            default:
                System.out.println("I didn't understand that!");
        }

    }
}

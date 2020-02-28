package Lesson;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Lesson {

    // lambda expressions
    // in Java, lambda expressions are the closest we can get to having functions as objects
    // anonymous implementation of an interface

    public static void main(String[] args) {

        //before lambdas you would have to do something called
        //an anonymous inner class

        Functionable functionable = new Functionable() {
            @Override
            public int add(int a, int b) {
                return a + b;
            }
        };


        // this right here is what you would properly call a lambda
        // while there is still some boilerplate, there's a lot less of it!
        // compare and contrast to the anonymous inner class up top
        Functionable functionable1 = ( int a, int b) -> a+b;

        functionable1.add(3,3);

        // look at it like this:
        // everything before the arrow is your interface
        // everything to the right is you actually defining the implementation
        // for this example, the output will always be 3
        // functional code can ignore input and always give the same output
        // it depends on how you declare your lambda
        // therefore, we can say that functional programming is declarative
        Subbable subbable = (int a, int b) -> 3;


        System.out.println(functionable.add(3, 2));


        List<Integer> integerList = new ArrayList<>();

        integerList.add(1);
        integerList.add(2);
        integerList.add(3);

//        System.out.println(integerList);

        // stream is a sequence of elements supporting sequential
        // and parallel aggregate operations
        System.out.println("This is an example of a stream using stream method on a list");
        integerList.stream()
                .map(el -> el+1)
                .forEach(System.out::println);


        // you can actually convert directly into a stream
        // using a declaration

        Stream<Integer> integerStream = integerList.stream();

        // this code is exactly the same as the code above that uses .stream()
        System.out.println("This is a stream that was declared with a declaration as an object:");
        integerStream.map(el -> el +1)
                .forEach(System.out::println);


        // you don't have to use lists
        // arrays can be implemented with streams as well
        // pretty most collections have the method .stream() available
        Integer[] numArray = {2, 4, 8};
        Stream<Integer> numStream = Arrays.stream(numArray);


        // this map method takes in a lambda expression as its only argument
        // maps will return a new stream object containing the changed elements
//        numStream.map(el -> el / 2)
//                .forEach(System.out::println);

        System.out.println("This is my num stream filtered:");
        numStream.filter(el -> el > 3)
//                .toArray(Integer[]::new); // this toArray method converts the stream back to an array
                .forEach(System.out::println);


        List<Integer>numList = new ArrayList<>();
        numList.add(3);
        numList.add(4);
        numList.add(8);

        // in Java there multiple reduction methods on collections
        // you can sum, count, average, etc
        Integer sum = numList.stream()
                .mapToInt(el -> el)
                .sum();

        System.out.println("This is the sum result of a reduction:");
        System.out.println(sum);

        List<Integer> otherList = new ArrayList<>();
        otherList.add(1);
        otherList.add(3);
        otherList.add(7);

        // you can also simply use the reduce method on a stream
        // note that this takes in two values: an initial value for the reduction and a lambda expression to get to that value

        Integer reducedList = otherList.stream()
                .reduce(0, (a, b) -> a +b);

        System.out.println("Here is a reduced stream using the reduce method");
        System.out.println(reducedList);


    }
}

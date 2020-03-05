package Lesson;

import java.util.ArrayList;
import java.util.List;

public class Lesson {



    public static Integer printItem(ArrayList<Integer> intergerList){
        return intergerList.get(2);
    }

    public static void printAllItems(ArrayList<Integer> integerList){
        for (int item : integerList){
            System.out.println(item);
        }
    }

    public static void printNumbers(int n){
        for (int i = 0; i <= n; i++ ){
            System.out.println(i);
        }
    }

    public static void printAllNested(ArrayList<Integer> integerList){
        for (int item : integerList){
            for (int otherItem : integerList){
                System.out.println(item+ ", "+otherItem);
            }
        }
    }




    /* Big O Notation! */


    /*  Let's go ahead and create our entry point */
    public static void main(String[] args) {


        // Big O is the way we determine the efficiency and complexity of an algorithm
        // Big O is really important for describing how an algorithm scales

        // With Big O notation, we express the runtime in terms of how it quickly...
        // ... it grows relative to the input, as the input gets arbitrarily large.

        // In Big O, you'll see algorithms describes with logarithms
        // in its simplest form, a logarithm answers the following question:
        // how many of one number do we multiply to get another number?
        // log2(8) = 3
        // 2^3 = 8

        // People have many different computers and they'll operate on different levels
        // We cannot determine the runtime just by determining computer architecture
        // we use Big O to talk about how quickly the runtime grows
        // Big O  is relative to the input
        // n describes the size of the input
        // we can say things like the runtime grows
        // "on the order of the size of the input" 0(n)
        // "on the order the square of the size of the input" 0(n^2)

        // Remember that Big O describes the algorithm as the input gets abritarily large
        // small steps in the algorithm may be eclipsed by other steps once the program scales

        ArrayList<Integer> intergerList = new ArrayList<>();

        intergerList.add(3);
        intergerList.add(2);
        intergerList.add(1);
        intergerList.add(4);
        intergerList.add(7);


        // in Big O you would say the following method has a Big O of O(1)
        // this operation is described as constant
        System.out.println(printItem(intergerList));

        // Big O of O(n)
        // this operation is described as linear
        // if we had 10 items, 10 items would be printed
        printAllItems(intergerList);

        // Big 0 of 0(n2)
        // this operation is described as quadratic
        // if we had 10 items, 100 items would be printed
        printAllNested(intergerList);

        // The following can also have a Big O notation
        // Big O can describe both numbers and variable size
        // so integers and collections can be a part of a Big O notation
        int num = 5;
        printNumbers(num);

        // the input doesn't really matter
        // as long that that input can de described and operated on mathatically

        // the method below has a big O of O(1) because the operation is constant
        System.out.println("This is a string, but it can be described with Big O notation!");


        // You can do math operations on Big O but you always drop the constant
        // So something like O(2n) is really just 0(n)
        // You also describe Big O as the worst case scenario
        // if your operation is O(3n log n^2) we'd shorten to O(n^2)

        // when we have more than one unique operation we can ascribe it another variable
        // So an operation can have a Big O of O(a+b)
    }



}

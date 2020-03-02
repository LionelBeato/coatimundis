package Lab;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class Lab {


    //1. Create an ArrayList of at least 10 elements

    public static void main(String[] args) {

        // take note that you can initialize an array's size or (capacity) when you declare it)

        int[] myArray = new int[5];
        myArray[0] = 3;
        myArray[1] = 2;
        myArray[2] = 7;
        myArray[3] = 4;
        myArray[4] = 6;

        int[] numArray = new int[4];
        numArray = new int[]{1, 3, 4, 6};

        System.out.println(numArray);


        ArrayList<String> myStrings = new ArrayList<>(20); // with arraylists you can set the initial capacity
        myStrings.add("hello");
        myStrings.add("this");
        myStrings.add("is");
        myStrings.add("my");
        myStrings.add("string");
        myStrings.add("list!");
        myStrings.add("I");
        myStrings.add("really");
        myStrings.add("like");
        myStrings.add("it!");

        System.out.println(myStrings.toString().replace("[","").replace(",", "").replace("]", ""));



        //2. Use an enhanced for loop to iterate through that list and print out each value.

        for (String string : myStrings){ // in enhanced for loops, you give each element an identifier

            //3. Write control flow that checks to see if a specific element is inside the array and print out a statement acknowledging that value (so if you're favorite animal is in an animal list, print out "That's my favorite animal!").
            if (string == "like"){
                System.out.println("love");
            } else{
                System.out.println(string);
            }
        }

        //4. Create a simple hashmap with 5 different elements.

        HashMap<Integer, String> myHash = new HashMap<>();
        myHash.put(0, "Koala");
        myHash.put(3, "Dog");
        myHash.put(45, "Cat");
        myHash.put(33, "Dolphin");
        myHash.put(12, "Meerkat");

        System.out.println(myHash);



        //5. Create a LinkedList with 5 different elements.

        LinkedList<String> myLinked = new LinkedList<>();
        myLinked.add(0, "Blue");
        myLinked.add(1,"Purple");
        myLinked.add(2, "Green");
        myLinked.add(3, "Yellow");
        myLinked.add(4, "Red");

        System.out.println(myLinked);

        //6. In your LinkedList, set a new value to the middle element.

        myLinked.set(2, "Orange");

        System.out.println(myLinked);



    }




}

package Lesson;

import java.util.*;

public class Lesson {

    public static void main(String[] args) {


        // data structures are different methods of organizing and storing information (data)

        // traversing: this means visiting every element of the data structure, in order to perform a specific operation
        // insertion: this means adding an element to a data structure
        // deletion: this means the process of removing an element, if we try to delete an element from an empty data structure, an underflow occurs
        // searching: this means the process of finding a location of an element
        // sorting: this means the process of arranging the data structure in some specific order
        // merging: this means joing two different data structures with similar types of data

        // here is an array
        String[] myArray = {"one", "two", "three"};
        System.out.println(myArray[1]); // indexing at 1 will give us "two" because arrays are zero indexed

        // Arrays can be of any data type
        int[] intArray = {};
        boolean[] boolArray;
        char[] charArray;
        // they even work with wrapper types
        Integer[] integerArray;

        System.out.println(intArray); // you can print out an empty array but the result will be a hash

        // We also have ArrayLists

        // arraylists are dynamic as opposed to the  fixed arrays

        // take note of the generic typing, this will sometimes be referred to as the diamond syntax
        // on the righthand side, you don't need to specify the generic type
        ArrayList<String> stringArrayList = new ArrayList<>();

        stringArrayList.add("one");
        stringArrayList.add("two");
        stringArrayList.add("three");


        System.out.println(stringArrayList.get(0)); // take note that to index a list you need the get method
        // the major methods for lists are .add(), .get(), .remove()
        // there's also .reverse()
        // there's .contains() which returns a boolean if the list contains an element
        System.out.println(stringArrayList.contains("four"));

        // there's also .clear, which removes everything from the list


        // in java, it's important to remember that strings are pretty much just arrays

        String myString = "This is a string!";
        String str[] = myString.split(" "); // this is to showcase that arrays are very closely related to strings
        System.out.println(myString);

        List<String> arrayString;
        arrayString = Arrays.asList(myString);
        System.out.println(arrayString);

        ArrayList<String> fruitList = new ArrayList<>();
        fruitList.add("Apple");
        fruitList.add("Pear");
        fruitList.add("Grape");

        for (String fruit : fruitList){ // take note that for this traversal, you declare the element name semantically
            System.out.println(fruit);
        }


        System.out.println(arrayString.toString().replace("[","").replace("]",""));


        // Now lets talk about HashMaps!
        // to declare a hashmap, for the generic you need two types specified
        HashMap<Integer, String> myHash = new HashMap<>();
        myHash.put(0, "Mike"); // note that keys are always unique and that values can be shared

        // myHash.remove(0); // this should remove (pop) an element
        myHash.size(); // should return the amount of elements in the hashmap
       // myHash.clear(); // removes all the elements

        myHash.keySet(); // will only return keys
        myHash.values(); // will only return values

        System.out.println(myHash);

        // linkedlists!
        // LinkedList are data structures with two fields per "node", a data data field and a pointer to the next node
        // LinkedList started with a head pointer and terminate with a pointer to null

        LinkedList<String> animalList = new LinkedList<>();
        animalList.add("Dog");
        animalList.add("Parrot");
        animalList.add("Giraffe");

        System.out.println(animalList);
        animalList.addFirst("Shark");
        System.out.println(animalList);

        animalList.addLast("Koala");

        animalList.add(3, "Cuttlefish");
        System.out.println(animalList);

        animalList.set(3, "Octopus");
        System.out.println(animalList);















    }
}

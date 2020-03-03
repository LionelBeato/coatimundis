package Lesson;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class Lesson {

    public int returnsThree(){
        return 3;
    }

    public static void main(String[] args) {

        // Stacks and Queues


        // Stack

        // you declare a stack using generic typing
        // this similar to declaring a list
        Stack<Integer> integerStack = new Stack<>();

        // pushing will add an item
        integerStack.push(1);
        integerStack.push(2);
        integerStack.push(3);
        integerStack.push(4);
        integerStack.push(5);

        // you can print out the contents of the stack by simply calling inside of a sout

        System.out.println(integerStack);

        // you can remove an item from a stack using pop

        integerStack.pop();

        // item should now be removed, note that the last item in was the first item out

        System.out.println(integerStack);

        // you can set the size of the stack manually using set size

        integerStack.setSize(4);

        // you can still push items to the stack however, I believe this is because Stack ultimately inherits from List
        integerStack.push(5);

        System.out.println(integerStack);

        // you can use peek to access the value at the top of the stack without affecting it
        System.out.printf("This is the value I get when I peek: %d\n", integerStack.peek());
        System.out.println(integerStack);
        // you can check if a stack is empty using the empty method, it'll return a boolean value
        System.out.printf("This is the boolean value I get when I call the empty method: %b\n", integerStack.empty());

        System.out.println(integerStack.search(3));

        Stack<String> stringStack = new Stack<>();

        stringStack.push("hello");
        stringStack.push("hola");
        stringStack.push("saluton");
        stringStack.push("guten tag");

        System.out.println(stringStack);

        // the search will return the position of the item that you searched for
        // in reference to the top of the stack
        // so essentially, it's counting backwards
        System.out.println(stringStack.search("guten tag"));


        // Queues


        // you can declare a queue with priorityqueue or linkedlist
        // PriorityQueues will attempt to naturally order the queue
        // the order for strings will be alphabetical
        // the order for integers will be determined by size
        Queue<String> q = new LinkedList<>();

        // add method will add elements to the queue
        q.add("tacos");
        q.add("hot dogs");
        q.add("rice bowls");
        q.add("apples");

        System.out.println(q);

        // this will give us the head of the queue
        // note that it'll be the first element that we defined
        System.out.println(q.element());

        // calling remove method will remove the head of the queue
        // this follows the first in first out paradigm thats inverse to stacks
        q.remove();
        System.out.println(q.element());

        // poll will return the head of the queue and remove it from the queue
        System.out.println(q.poll());
        System.out.println(q);


        int x = 3;











    }
}

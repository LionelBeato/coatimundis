package Lab;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Lab {

    public static void main(String[] args) {

//        1. In a Java project, create a stack of at least 5 items. Note where the elements are placed in the stack.

        Stack<String> myStack = new Stack<>();
        myStack.push("apples");
        myStack.push("oranges");
        myStack.push("pears");
        myStack.push("grapefruits");
        myStack.push("dragonfruits");

//        2. Remove two elements from the stack.

        myStack.pop();
        myStack.pop();

//        3. Print the current top of the stack to the console.

        System.out.println(myStack.peek());

//        4. Next create a queue with at least 5 elements. Note where the elements are placed in the queue.

        Queue<String> myQueue = new LinkedList<>();

        myQueue.add("paper");
        myQueue.add("rock");
        myQueue.add("scissors");
        myQueue.add("spock");
        myQueue.add("fire");


//        5. Remove two elements from the queue.

        myQueue.remove();
        myQueue.remove();

        System.out.println(myQueue.element());

    }
}

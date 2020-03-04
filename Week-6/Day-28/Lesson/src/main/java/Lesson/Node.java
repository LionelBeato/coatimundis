package Lesson;

public class Node {
    int value;
    Node left;
    Node right;


    Node (int value){
        this.value = value;
        right = null;
        left = null;
    }

    @Override
    public String toString() {
        return "Node{" +
                "value=" + value +
                ", left=" + left +
                ", right=" + right +
                '}';
    }
}

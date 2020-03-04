package Lesson;

import java.util.ArrayList;
import java.util.List;

public class BinaryTree {

    Node root;

    private Node addRecursive(Node current, int value){
        if ( current == null){
            return new Node(value);
        }

        if (value < current.value){
            current.left = addRecursive(current.left, value);
        } else if (value > current.value) {
            current.right = addRecursive(current.right, value);
        } else {
            return current;
        }
        return current;
    }

    public void add(int value){
        root = addRecursive(root, value);
    }

    private static BinaryTree createBinaryTree(){
        BinaryTree bt = new BinaryTree();

        bt.add(6);
        bt.add(7);
        bt.add(3);
        bt.add(2);
        bt.add(9);
        return bt;
    }

    private boolean containsNodeRecursive(Node current, int value){
        if (current == null){
            return false;
        }
        if (value == current.value){
            return true;
        }

        return value < current.value
                ? containsNodeRecursive(current.left, value)
                : containsNodeRecursive(current.right, value);
    }

    public boolean containsNode(int value){
        return containsNodeRecursive(root,value);
    }

    @Override
    public String toString() {
        return "BinaryTree{" +
                "root=" + root +
                '}';
    }

    public static void main(String[] args) {
        BinaryTree bt = createBinaryTree();
        System.out.println(bt.containsNode( 19));
    }




}

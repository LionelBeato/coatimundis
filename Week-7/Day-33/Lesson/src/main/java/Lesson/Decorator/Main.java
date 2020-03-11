package Lesson.Decorator;

public class Main {

    public static void main(String[] args) {


        // here we're creating a new tree with our christmastree implementation
        // this is the core of the decorator pattern
       ChristmasTree tree = new BubbleLights(new ChristmasTreeImpl());
       // wrapping the implementation with decorators to add more christmas tree decorations
       ChristmasTree othertree = new Ornaments(new Popcorn(new BubbleLights(new ChristmasTreeImpl())));

       // decorators will be implemented with @ symbol
        // in Java, these decorators are referred to as annotations


       System.out.println(tree.decorate());
        System.out.println(othertree.decorate());



    }
}

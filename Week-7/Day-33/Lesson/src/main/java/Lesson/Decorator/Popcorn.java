package Lesson.Decorator;

public class Popcorn extends TreeDecorator{

    public Popcorn(ChristmasTree tree) {
        super(tree);
    }


    public String decorate(){
        return super.decorate() + decorateWithPopcorn();
    }

    private String decorateWithPopcorn(){
        return " with Popcorn";
    }
}

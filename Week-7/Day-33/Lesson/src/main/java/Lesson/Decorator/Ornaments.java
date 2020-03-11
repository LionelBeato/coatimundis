package Lesson.Decorator;

public class Ornaments extends TreeDecorator{


    public Ornaments(ChristmasTree tree) {
        super(tree);
    }

    @Override
    public String decorate(){
        return super.decorate() + decorateWithOrnaments();
    }

    private String decorateWithOrnaments(){
        return " with Ornaments";
    }
}

package Lesson;

public class Bird extends Animal {

    public Bird(String name) {
        super(name);
    }

    //Overriding effectively replaces conditionals and decision trees
    //this calls back to two fundamental OOP principles: polymorphism and inheritance
    @Override
    public String doCry() {
        return "This bird tweeted!";
    }
}

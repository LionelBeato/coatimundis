package Lesson;

public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    public String doCry() {
        return "This dog barked!";
    }
}

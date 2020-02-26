package Lesson;

public class Tiger extends Animal implements Catchable, Hollerable {

    @Override
    public String getSound() {
        return "Tiger went roar";
    }

    @Override
    public void hasBeenCaught() {
        System.out.println("This tiger was caught by the toe!");
    }

    @Override
    public void hasHollered() {
        System.out.println("This tiger hollered");
    }
}

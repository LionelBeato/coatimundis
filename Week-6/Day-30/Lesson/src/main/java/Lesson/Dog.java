package Lesson;

public class Dog {
    private String name;
    private int age;
    // since this variable is public, you don't need getters and setters to access it
    public static int amountOfDogs = 0;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // constructors do not have a return type
    public Dog(String name, int age) {
        // the "this" keyword refers to the object of the current class
        // in Java, it is most often seen inside of constructors
        this.name = name;
        this.age = age;
        amountOfDogs++;
    }
}

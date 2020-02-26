package Lesson;

public class Lesson {

    public static void main(String[] args) {

        // Any class can have its constructor called
        // Even wrapper classes
  //      Integer num = new Integer(5);
        Integer num = 5;
        System.out.println(num.getClass());

        // In Java, you can create your own classes
        // You can also specify the constructor, but all classes have an implicit constructor that they inherit from Object
        // Recall the properties of inheritance
        // the child can do everything the parent can, plus more
        // note that constructing is a perfect example of ENCAPSULATION!
        Person bobby = new Person("Bobby", 01);
        // Person can be constructed as an Object because of polymorphism
        Object sam = new Person();

        // note that new keyword allows us to construct
        // if we want to use a method in an object, we always specific the indentifier and then write the method as such:
        bobby.getName(); // "Bobby" is the same thing as this method to your computer at the end of the day



        Lion Leo = new Lion();
        System.out.println(Leo.getSound());

        Tiger tony = new Tiger();
        tony.hasBeenCaught();
    }
}

package Lesson.AbstractFactory;

public class FactoryProvider {

    // this is the abstractfactory implementation
    // note how we can define more factories if we wanted to
    public static AbstractFactory getFactory(String choice){
        if ("Animal".equalsIgnoreCase((choice))){
            return new AnimalFactory();
        }
        return null;
    }

    // why would we use an abstractfactory?

    // abstraction might be the biggest reason
    // this pattern is a highly Object Oriented


}

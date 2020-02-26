package Lesson;

// abstract means that the implementation is hidden away, referring to to ABSTRACTION
// this class does not care about the implementation, it cares about child classes satisfying the contract
// fields and methods can both be abstract
// interfaces describe only abstract fields and method
public abstract class Animal {
    // abstract methods always need an abstract class to belong to
    // otherwise, the compiler will throw an error!
    public abstract String getSound();
}

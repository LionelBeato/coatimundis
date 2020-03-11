package Lesson.AbstractFactory;

public interface AbstractFactory<T> {
    T create (String animalType);
}

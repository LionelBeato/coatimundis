package Review;

import java.util.Objects;

// this class is extending the class Animal and inherits its properties
public class Dog extends Animal {

    private int amountOfLegs;
    private String color;

    public int getAmountOfLegs() {
        return amountOfLegs;
    }

    public void setAmountOfLegs(int amountOfLegs) {
        this.amountOfLegs = amountOfLegs;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Dog(int amountOfLegs, String color) {
        this.amountOfLegs = amountOfLegs;
        this.color = color;
    }

    // this is an overridden method
    // override means the code implementation can change from its parent implementation
    @Override
    public String speak() {
        return "Woof!";
    }

    @Override
    public String toString() {
        return "Dog{" +
                "amountOfLegs=" + amountOfLegs +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return amountOfLegs == dog.amountOfLegs &&
                Objects.equals(color, dog.color);
    }



    @Override
    public int hashCode() {
        return Objects.hash(amountOfLegs, color);
    }


}

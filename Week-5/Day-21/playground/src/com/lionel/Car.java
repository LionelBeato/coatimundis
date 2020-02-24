package com.lionel;

public class Car {
    // typically, you want your fields in a class to be private
    private int numOfWheels;
    private int numOfSeats;
    // that being said, you can still declare a public field
    public int numOfMirrors;


    // private fields needs getters and setters to actually be utilized by other classes
    public int getNumOfWheels() {
        return numOfWheels;
    }

    public void setNumOfWheels(int numOfWheels) {
        this.numOfWheels = numOfWheels;
    }

    public int getNumOfSeats() {
        return numOfSeats;
    }

    public void setNumOfSeats(int numOfSeats) {
        this.numOfSeats = numOfSeats;
    }

    // constructors do not have an access type our a return type
    // in Java, you simply say the name of the class
    Car (int numOfWheels, int numOfSeats){
        setNumOfSeats(numOfSeats);
        setNumOfWheels(numOfWheels);
    }

}

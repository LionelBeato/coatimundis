package com.lionel;

public class Main {

    public static void main(String[] args) {

        // since string is an object, you can use a constructor to create a new instance of String
        String myString = new String();


        // constructing a new car instance
        Car newCar = new Car(4, 4);
        // I can declare a car as an object but I wont be able to use the car fields or methods
        Object otherCar = new Car(4, 4);

        newCar.setNumOfSeats(2);

        System.out.println(newCar.getNumOfSeats());
	// write your code here
    }
}

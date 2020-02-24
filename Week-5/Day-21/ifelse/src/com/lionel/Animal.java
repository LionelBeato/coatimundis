package com.lionel;

import java.util.Objects;

public class Animal {

    int numOfLegs = 4;
    String speak(){
        return "this animal spoke";
    }

    @Override
    public String toString() {
        return "Animal{" +
                "numOfLegs=" + numOfLegs +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return numOfLegs == animal.numOfLegs;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numOfLegs);
    }
}

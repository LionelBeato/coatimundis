package com.lionel;

public class Dog extends Animal {

    @Override
    public String speak(){
        return "dog goes woof";
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return "Dog";
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    
}

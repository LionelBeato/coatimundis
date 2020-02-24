package com.lionel;

public class Cat extends Animal {

    @Override
    public String speak(){
        return "cat goes meow";
    }

    @Override
    public String toString() {
        return "Cat";
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}

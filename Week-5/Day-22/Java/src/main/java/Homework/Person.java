package Homework;

public class Person {

    private String name;
    private int birthday;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBirthday() {
        return birthday;
    }

    public void setBirthday(int birthday) {
        this.birthday = birthday;
    }

    public Person(String name, int birthday) {
        this.name = name;
        this.birthday = birthday;
    }
}

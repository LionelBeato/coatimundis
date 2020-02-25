package Homework;

public class Student extends Person {
    // Student variables
    private String name;

    // constructor with all variables
    public Student(String name, int age, int gradYear, int studentID, int birthday) {
        super(name, birthday);
        this.name = name;
        this.age = age;
        this.gradYear = gradYear;
        this.studentID = studentID;
    }

    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getGradYear() {
        return gradYear;
    }

    public void setGradYear(int gradYear) {
        this.gradYear = gradYear;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    private int gradYear;
    private int studentID;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gradYear=" + gradYear +
                ", studentID=" + studentID +
                '}';
    }
}

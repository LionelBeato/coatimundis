import java.util.ArrayList;
import java.util.List;

import Homework.Student;

public class Main {

    public static void main(String[] args) {

        // creating an array of students
        List<Student> studentList = new ArrayList<>();

        //constructing three new students
        Student mike = new Student("Mike",30,2020,01,1990);
        Student jesse = new Student("Jesse",29,2020,02,1991);
        Student lisa = new Student("Lisa",31,2020,03,1989);

        studentList.add(mike);
        studentList.add(jesse);
        studentList.add(lisa);


        // the following is all one statement
        // it is a stream of data that takes in lambda functions
        // on a list you can call higher order functions
        // you initialize it by calling the stream method
        studentList.stream()
                // use .map() to manipulate the data in some way
                // use .forEach() to perform an action on each element after .map()
                .map(student -> student.toString())
                .forEach(System.out::println);



    }
}

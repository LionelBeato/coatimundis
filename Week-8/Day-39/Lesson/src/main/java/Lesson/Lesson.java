package Lesson;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Lesson {

    public static void main(String[] args) {

        // constructing an instance of my connection manager
        // note the values being passed in
        ConnectionManager dcm = new ConnectionManager("localhost", "test", "root", "");

        // simple try and catch block to handle errors
        // note the use of of resources with our try block
        try (Connection connection = dcm.getConnection()){

            // this allows use to write a statement with our connection
            Statement statement = connection.createStatement();

            // manually declaring a query
            ResultSet resultSet = statement.executeQuery("SELECT * FROM songs");

            // printing the result of our query
            // resultSet is like a cursor that will point to a certain position in your database
            // this while loop will stop once there isn't a next value to read
            while (resultSet.next()) {

                // this print statement is pointing to the second column "song_title"
                // it'll return the values accordingly
                System.out.println(resultSet.getString(2));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }


        // You may be wondering how JPA is related to JDBC
        // JPA stands for Java Persistance Abstraction
        // It's more or less an abstraction of JDBC
        // In Spring Boot we use JPA
        // JPA is an abstraction layer on top of JDBC
        // it allows us the ability to not have to write SQL code

    }


}

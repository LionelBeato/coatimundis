package Lesson;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

// in Java, there's concept called JDBC
// it stands for Java DataBase Connectivity
// JDBC allows you to connect your Java code to a SQL/noSQL database
// we connect via "drivers" that give us accessibility


// this class is helps me construct a new connection to a database
// using jdbc configurations in code
public class ConnectionManager {

    // this is the url of our connection
    private final String url;
    // this field defines our properties
    private final Properties properties;

    public ConnectionManager(String host, String databaseName, String username, String password) {
        // this is defining our url connection
        this.url = "jdbc:mariadb://"+host+"/"+databaseName;
        this.properties = new Properties();
        // this is assigning the username and password
        this.properties.setProperty("user", username);
        this.properties.setProperty("password", password);
    }

    // this method allows us to actually commit the connection
    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(this.url, this.properties);
    }

}

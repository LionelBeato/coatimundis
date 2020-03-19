package Lesson;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;


// this class is helps me construct a new connection to a database
// using jdbc configurations in code
public class ConnectionManager {

    private final String url;
    private final Properties properties;

    public ConnectionManager(String host, String databaseName, String username, String password) {
        this.url = "jdbc:mariadb://"+host+"/"+databaseName;
        this.properties = new Properties();
        this.properties.setProperty("user", username);
        this.properties.setProperty("password", password);
    }

    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(this.url, this.properties);
    }

}

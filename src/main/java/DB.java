
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DB{
    // Global connection Class
    static Connection con;
    public static Connection getConnection() throws ClassNotFoundException {
        String jdbcConectors = "com.mysql.cj.jdbc.Driver"; //connect jdbc
        String url ="jdbc:mysql://localhost:3307/atm"; //url connect mysql
        String user ="root"; // user mysql
        String password = "root";//password mysql
        Class.forName(jdbcConectors);
        try {
            con = DriverManager.getConnection(url, user,password);
        } catch (SQLException e) {
            System.out.println("Connection Failed!"); // Message Failed Connection mysql
            throw new RuntimeException(e);
        }
        return con;
    }

}

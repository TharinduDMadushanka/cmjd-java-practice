import java.sql.*;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException { // Step 02
        Class.forName("com.mysql.cj.jdbc.Driver"); // Step 01 --> load mysql driver

        Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/supermarket","root","Thariya920@");

        Statement statement = connection.createStatement();
        String sql= "SELECT * FROM customer";
        ResultSet resultSet= statement.executeQuery(sql);
    }
}
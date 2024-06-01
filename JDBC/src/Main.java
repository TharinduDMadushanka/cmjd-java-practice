import java.sql.*;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException { // Step 02
        Class.forName("com.mysql.cj.jdbc.Driver"); // Step 01 --> load mysql driver

        Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/supermarket","root","Thariya920@");

        // Step 03
        Statement statement = connection.createStatement();
        String sql= "SELECT * FROM customer";
        ResultSet resultSet= statement.executeQuery(sql);

        // Step 04 --> Execute query
        while (resultSet.next()){
            System.out.println(resultSet.getString("CustID") + " " + resultSet.getString("CustTitle") + " " + resultSet.getString("CustName") + " " + resultSet.getDouble("salary"));
        }
    }
}
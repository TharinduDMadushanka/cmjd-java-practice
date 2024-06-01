import java.sql.*;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException { // Step 02
        Class.forName("com.mysql.cj.jdbc.Driver"); // Step 01 --> load mysql driver

        Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/supermarket","root","Thariya920@");

        // Step 03
        Statement statement = connection.createStatement();

        /**
         * // Step 04 --> Execute query

        String sql= "SELECT * FROM customer";
        ResultSet resultSet= statement.executeQuery(sql);

        while (resultSet.next()){
            System.out.println(resultSet.getString("CustID") + " " + resultSet.getString("CustTitle") + " " + resultSet.getString("CustName") + " " + resultSet.getDouble("salary"));
        }
         */

        // Step 05 --> Execute update
        String sql = "INSERT INTO Customer VALUES ('C033', 'Mr', 'Amal', '1998-10-15', 100000.00, 'Galle', 'Galle', 'Southern', '80000')";

        int result = statement.executeUpdate(sql);

        System.out.println(result>0 ? "Success" : "Fail");
    }
}
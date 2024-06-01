/**
 * work with user inputs
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Input Customer ID:");
        String custId = scanner.next();

        System.out.print("Input Customer Title:");
        String custTitle = scanner.next();

        System.out.print("Input Customer Name:");
        String custName = scanner.next();

        System.out.print("Input Customer DoB:");
        String custDob = scanner.next();

        System.out.print("Input Customer Salary:");
        double salary  = scanner.nextDouble();

        System.out.print("Input Customer Address:");
        String custAddress = scanner.next();

        System.out.print("Input Customer City:");
        String custCity = scanner.next();

        System.out.print("Input Customer Province:");
        String custProvince = scanner.next();

        System.out.print("Input Customer Zip code:");
        String zip = scanner.next();

        Class.forName("com.mysql.cj.jdbc.Driver"); // Step 01 --> load mysql driver

        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/supermarket", "root", "Thariya920@");

        // Step 03
        Statement statement = connection.createStatement();
    }
}

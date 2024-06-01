/**
 * work with user inputs
 */

import java.sql.*;
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Input Customer Id : ");
        String custId = scanner.nextLine();

        System.out.print("Input Customer Title : ");
        String title = scanner.nextLine();

        System.out.print("Input Customer Name : ");
        String name = scanner.nextLine();

        System.out.print("Input Customer DOB : ");
        String dob = scanner.nextLine();

        System.out.print("Input Customer Address : ");
        String address = scanner.nextLine();

        System.out.print("Input Customer City : ");
        String city = scanner.nextLine();

        System.out.print("Input Customer Province : ");
        String province = scanner.nextLine();

        System.out.print("Input Customer Zip : ");
        String zip = scanner.nextLine();

        System.out.print("Input Customer Salary : ");
        double salary = scanner.nextDouble();

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Supermarket", "root", "Thariya920@");

        String sql = "INSERT INTO Customer VALUES(?,?,?,?,?,?,?,?,?)";

        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, custId);
        statement.setString(2, title);
        statement.setString(3, name);
        statement.setString(4, dob);
        statement.setDouble(5, salary);
        statement.setString(6, address);
        statement.setString(7, city);
        statement.setString(8, province);
        statement.setString(9, zip);


        int result = statement.executeUpdate();

        System.out.println(result > 0 ? "Success" : "Fail");

    }
}

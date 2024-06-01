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
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Supermarket", "root", "mysql");

        Statement statement = connection.createStatement();
        String sql = "INSERT INTO Customer VALUES ('"+custId+"', '"+title+"', '"+name+"', '"+dob+"', "+salary+", '"+address+"', '"+city+"', '"+province+"', '"+zip+"')";

        int result = statement.executeUpdate(sql);

        System.out.println(result > 0 ? "Success" : "Fail");

    }
}

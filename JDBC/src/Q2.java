/**
 * work with user inputs
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {

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
    }
}

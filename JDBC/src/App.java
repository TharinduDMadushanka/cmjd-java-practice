import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws ClassNotFoundException, SQLException{
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input Customer Id : ");
        String custId = scanner.nextLine();



        Connection connection = DBConnection.getInstance().getConnetion();

        String sql = "SELECT * FROM Customer WHERE CustID = ?";

        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, custId);

        ResultSet rst = statement.executeQuery();
        while (rst.next()) {
            System.out.println(rst.getString("CustID") + " " + rst.getString("CustTitle") + " " + rst.getString("CustName") + " " + rst.getDouble("salary"));
        }
    }
}

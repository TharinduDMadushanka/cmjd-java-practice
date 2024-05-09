package Day10_Swing;

// Add customer form

import javax.swing.*;
import java.awt.*;

public class Q13 {
    public static void main(String[] args) {
        AddCustomerForm c1 = new AddCustomerForm();
    }
}

class AddCustomerForm extends JFrame {

    /**
     * Step 1 create gui
     */
    AddCustomerForm(){
        setSize(400,400);
        setTitle("Add Customer Form");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        setVisible(true);
    }

}

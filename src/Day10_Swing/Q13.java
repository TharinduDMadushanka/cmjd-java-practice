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

    JLabel titleLable;
    JButton addButton,cancelButton;

    AddCustomerForm(){
        /**
         * Step 1 create gui
         */

        setSize(400,400);
        setTitle("Add Customer Form");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        /**
         * Step 2 --> create Title and add&cancel buttons
         */
        titleLable=new JLabel("Add Customer form");
        titleLable.setFont(new Font("",1,32));
        titleLable.setHorizontalAlignment(JLabel.CENTER);
        add("North",titleLable);

        JPanel bottomPanel=new JPanel(new FlowLayout(FlowLayout.RIGHT));

        addButton=new JButton("Add");
        addButton.setFont(new Font("",1,12));
        bottomPanel.add(addButton);

        cancelButton=new JButton("Cancel");
        cancelButton.setFont(new Font("",1,12));
        bottomPanel.add(cancelButton);

        add("South",bottomPanel);

        setVisible(true);
    }

}

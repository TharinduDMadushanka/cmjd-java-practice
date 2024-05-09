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

    JLabel titleLable,idLabel,nameLabel,addressLabel,nicLabel;
    JButton addButton,cancelButton;
    JTextField idTextField, nameTextField, addressTextField, nicTextField;

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
         * Step 2 --> create Title
         */
        titleLable=new JLabel("Add Customer form");
        titleLable.setFont(new Font("",1,32));
        titleLable.setHorizontalAlignment(JLabel.CENTER);
        add("North",titleLable);


        /**
         * Step 3
         */

        JPanel centerPanel=new JPanel(new GridLayout(4,2));
        Font font=new Font("",1,15);

        idLabel=new JLabel("Id:");
        idLabel.setFont(font);
        centerPanel.add(idLabel);

        idTextField=new JTextField(5);
        idTextField.setFont(font);
        centerPanel.add(idTextField);

        nameLabel = new JLabel("Name");
        nameLabel.setFont(font);
        centerPanel.add(nameLabel);

        nameTextField = new JTextField(15);
        nameTextField.setFont(font);
        centerPanel.add(nameTextField);

        addressLabel = new JLabel("Address");
        addressLabel.setFont(font);
        centerPanel.add(addressLabel);

        addressTextField = new JTextField(20);
        addressTextField.setFont(font);
        centerPanel.add(addressTextField);

        nicLabel = new JLabel("NIC");
        nicLabel.setFont(font);
        centerPanel.add(nicLabel);

        nicTextField = new JTextField(10);
        nicTextField.setFont(font);
        centerPanel.add(nicTextField);

        add("Center", centerPanel);

        /**
         * Step 2 --> add&cancel buttons
         */

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

package Day13_OOP5;

/**
 * Option 02
 * but there is a problem --> we override actionPerformed method only once so we cant add more buttons
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Calculator extends JFrame implements ActionListener{

    JButton button;
    JTextField textField;

    Calculator(){
        setSize(300,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout());

        textField = new JTextField(10);
        textField.setFont(new Font("", 1, 25));
        add(textField);

        button = new JButton();
        button.setText("Button");
        button.setFont(new Font("", 1, 25));
        button.addActionListener(this);

        add(button);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e){
        String title = textField.getText();
        setTitle(title);
    }
}

class Example {
    public static void main(String[] args) {
        new Calculator();
    }
}

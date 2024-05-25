package Day13_OOP5;

/**
 * Option 6 from Option 5
 * we can pass action listener as a obj
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Calculator extends JFrame{

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

        /**
         * we can pass action listener as a obj
         */
        button.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String title = textField.getText();
                setTitle(title);
            }
        });

        add(button);
        setVisible(true);
    }
}

class Example {
    public static void main(String[] args) {
        new Calculator();
    }
}

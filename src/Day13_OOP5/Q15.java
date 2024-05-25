package Day13_OOP5;

/**
 * Local Inner Classes
 * Option 04
 * create class before it used
 * create inner cls in a method body
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

        /////////////////////////////
        class MyClass implements ActionListener{
            public void actionPerformed(ActionEvent e){
                String title = textField.getText();
                setTitle(title);
            }
        }
        /////////////////////////////

        button.addActionListener(new MyClass());

        add(button);
        setVisible(true);
    }
}

class Example {
    public static void main(String[] args) {
        new Calculator();
    }
}

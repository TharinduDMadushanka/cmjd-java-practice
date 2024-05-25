package Day13_OOP5;

/**
 * Regular Inner Class
 * Option 03
 * we can access outer class's attributes and behaviors in inner class
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
        button.addActionListener(new MyClass());

        add(button);
        setVisible(true);
    }

    class MyClass implements ActionListener{
        public void actionPerformed(ActionEvent e){
            String title = textField.getText();
            setTitle(title);
        }
    }
}

class Q14 {
    public static void main(String[] args) {
        new Calculator();
    }
}


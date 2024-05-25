package Day13_OOP5;

/**
 * Option 01
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
        button.addActionListener(new MyClass(this));

        add(button);
        setVisible(true);
    }
}


class MyClass implements ActionListener{
    private Calculator calculator;

    MyClass(Calculator calculator){
        this.calculator = calculator;
    }

    public void actionPerformed(ActionEvent e){
        String title = calculator.textField.getText();
        calculator.setTitle(title);
    }
}

class Example {
    public static void main(String[] args) {
        new Calculator();
    }
}


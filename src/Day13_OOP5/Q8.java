package Day13_OOP5;

/**
 * Interface as a Contract
 * Illegal --> add methods
 */
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;

class Calculator extends JFrame{

    JButton button;

    Calculator(){
        setSize(300,300);
        setTitle("Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout());

        button = new JButton();
        button.setText("Button");
        button.setFont(new Font("", 1, 25));
        //button.add(new MyClass()); // Illegal
        //button.addActionListener(new MyClass()); // Illegal

        add(button);
        setVisible(true);
    }
}

class MyClass{
    public void myMethod(){
        System.out.println("You pressed the button");
    }
}

class Example {
    public static void main(String[] args) {
        new Calculator();
    }
}

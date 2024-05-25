package Day13_OOP5;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

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
        button.addActionListener(new MyClass());

        add(button);
        setVisible(true);
    }
}

// interface ActionListener{
//     public void actionPerformed(ActionEvent evt);
// }

/**
 * create class using contract from ActionListener interface
 */
class MyClass implements ActionListener{
    public void actionPerformed(ActionEvent evt){
        System.out.println("You pressed the button");
    }
}

class Example {
    public static void main(String[] args) {
        new Calculator();
    }
}


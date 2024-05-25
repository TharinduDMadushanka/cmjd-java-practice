package Day13_OOP5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Q11 {
    public static void main(String[] args) {
        MyWindow myWindow = new MyWindow();
    }
}

class MyWindow extends JFrame {

    JButton button;
    JTextField textField;

    MyWindow() {
        setSize(300, 300);
        setTitle("My window");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout());

        textField = new JTextField(20);
        button = new JButton("Button");
        button.setFont(new Font("", 1, 25));
        button.addActionListener(new MyClass1(this));

        add(textField);
        add(button);
        setVisible(true);
    }
}

class MyClass1 implements ActionListener {
    MyWindow myWindow;

    MyClass1(MyWindow myWindow) {
        this.myWindow = myWindow;
    }

    public void actionPerformed(ActionEvent evt) {
        String text = myWindow.textField.getText();
        myWindow.setTitle(text);
    }
}

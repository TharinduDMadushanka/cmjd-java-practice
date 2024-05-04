package Day10_Swing;

import javax.swing.*;
import java.awt.*;

public class Q5{
    public static void main(String[] args) {

        Calculator c1 = new Calculator(); // there are not class called Calculator then we have to do extend JFrame class and inherit

    }
}

class Calculator extends JFrame{ // inherit JFrame class

    JButton button;
    JLabel label;

    Calculator(){
        setSize(500,400);
        setTitle("Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        setLayout(new BorderLayout());


        button=new JButton();
        button.setText("Click");
        button.setFont(new Font("",1,25));
        add("North",button);

        label=new JLabel();
        label.setText("This is a label");
        label.setFont(new Font("",1,25));
        add("South",label);

        setVisible(true);
    }
}
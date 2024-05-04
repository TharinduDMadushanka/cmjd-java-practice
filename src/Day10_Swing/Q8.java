package Day10_Swing;

/**
 * Grid Layout
 */

import javax.swing.*;
import java.awt.*;

public class Q8{
    public static void main(String[] args) {

        Calculator4 c1 = new Calculator4(); // there are not class called Calculator then we have to do extend JFrame class and inherit

    }
}

class Calculator4 extends JFrame{ // inherit JFrame class

    JButton button1;
    JButton button2;
    JButton button3;
    JButton button4;
    JButton button5;
    JLabel label;

    Calculator4(){
        setSize(300,400);
        setTitle("Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        setLayout(new GridLayout(2,2));

        button1=new JButton();
        button1.setText("Click1");
        button1.setFont(new Font("",1,25));
        add(button1);

        button2=new JButton();
        button2.setText("Click2");
        button2.setFont(new Font("",1,25));
        add(button2);

        button3=new JButton();
        button3.setText("Click3");
        button3.setFont(new Font("",1,25));
        add(button3);

        button4=new JButton();
        button4.setText("Click4");
        button4.setFont(new Font("",1,25));
        add(button4);



        setVisible(true);
    }
}
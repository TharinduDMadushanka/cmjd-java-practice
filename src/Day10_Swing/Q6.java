package Day10_Swing;

import javax.swing.*;
import java.awt.*;

public class Q6{
    public static void main(String[] args) {

        Calculator2 c1 = new Calculator2(); // there are not class called Calculator then we have to do extend JFrame class and inherit

    }
}

class Calculator2 extends JFrame{ // inherit JFrame class

    JButton button1;
    JButton button2;
    JButton button3;
    JButton button4;
    JButton button5;
    JLabel label;

    Calculator2(){
        setSize(500,400);
        setTitle("Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        setLayout(new BorderLayout());


        button1=new JButton();
        button1.setText("Click");
        button1.setFont(new Font("",1,25));
        add("North",button1);

        button2=new JButton();
        button2.setText("Click");
        button2.setFont(new Font("",1,25));
        add("West",button2);

        button3=new JButton();
        button3.setText("Click");
        button3.setFont(new Font("",1,25));
        add("South",button3);

        button4=new JButton();
        button4.setText("Click");
        button4.setFont(new Font("",1,25));
        add("East",button4);

        button5=new JButton();
        button5.setText("Click");
        button5.setFont(new Font("",1,25));
        add("Center",button5);

        setVisible(true);
    }
}
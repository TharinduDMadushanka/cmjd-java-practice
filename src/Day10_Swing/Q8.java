package Day10_Swing;

/**
 * Grid Layout
 */

import javax.swing.*;
import java.awt.*;

public class Q8{
    public static void main(String[] args) {

        Calculator3 c1 = new Calculator3(); // there are not class called Calculator then we have to do extend JFrame class and inherit

    }
}

class Calculator4 extends JFrame{ // inherit JFrame class

    JButton button1;
    JButton button2;
    JButton button3;
    JButton button4;
    JButton button5;
    JLabel label;

    Calculator40(){
        setSize(300,400);
        setTitle("Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        setLayout(new FlowLayout()); // --> default float all buttons into center
//        setLayout(new FlowLayout(FlowLayout.RIGHT)); --> float all buttons to right
//        setLayout(new FlowLayout(FlowLayout.LEFT)); --> float all buttons to left

        button1=new JButton();
        button1.setText("Click");
        button1.setFont(new Font("",1,25));
        add(button1);

        button2=new JButton();
        button2.setText("Click");
        button2.setFont(new Font("",1,25));
        add(button2);

        button3=new JButton();
        button3.setText("Click");
        button3.setFont(new Font("",1,25));
        add(button3);

        button4=new JButton();
        button4.setText("Click");
        button4.setFont(new Font("",1,25));
        add(button4);

        button5=new JButton();
        button5.setText("Click");
        button5.setFont(new Font("",1,25));
        add(button5);

        setVisible(true);
    }
}
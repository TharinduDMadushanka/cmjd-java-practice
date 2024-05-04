package Day10_Swing;

/**
 * create label and buttons in south and north
 */

import javax.swing.*;
import java.awt.*;

public class Q11 {
    public static void main(String[] args) {

        Calculator7 c1 = new Calculator7(); // there are not class called Calculator then we have to do extend JFrame class and inherit

    }
}

class Calculator7 extends JFrame { // inherit JFrame class

    JButton headerBtn;
    JButton footerBtn;
    JButton rSideNavBtn;
    JButton lSideNavBtn;

    JButton button1;
    JButton button2;
    JButton button3;
    JButton button4;

    Calculator7() {
        setSize(500, 400);
        setTitle("Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        Font font = new Font("", 1, 25);

        setLayout(new BorderLayout());

        headerBtn=new JButton("Header");
        headerBtn.setFont(font);
        add("North",headerBtn);

        footerBtn=new JButton("Footer");
        footerBtn.setFont(font);
        add("South",footerBtn);

        rSideNavBtn=new JButton("Right side nav");
        rSideNavBtn.setFont(font);
        add("East",rSideNavBtn);

        lSideNavBtn=new JButton("Left side nav");
        lSideNavBtn.setFont(font);
        add("West",lSideNavBtn);

        JPanel centerPanel=new JPanel();
        centerPanel.setLayout(new GridLayout(2,2));

        button1=new JButton("1");
        button1.setFont(font);
        centerPanel.add(button1);

        button2=new JButton("2");
        button2.setFont(font);
        centerPanel.add(button2);

        button3=new JButton("3");
        button3.setFont(font);
        centerPanel.add(button3);

        button4=new JButton("4");
        button4.setFont(font);
        centerPanel.add(button4);

        add("Center",centerPanel);

        setVisible(true);
    }
}
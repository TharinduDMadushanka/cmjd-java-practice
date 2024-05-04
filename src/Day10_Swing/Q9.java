package Day10_Swing;

/**
 * Grid Layout
 */

import javax.swing.*;
import java.awt.*;

public class Q9{
    public static void main(String[] args) {

        Calculator5 c1 = new Calculator5(); // there are not class called Calculator then we have to do extend JFrame class and inherit

    }
}

class Calculator5 extends JFrame{ // inherit JFrame class

    JButton button1;
    JButton button2;
    JButton button3;
    JButton button4;
    JButton button5;
    JButton button6;
    JButton button7;
    JButton button8;
    JButton button9;
    JButton button0;
    JButton buttonMulti;
    JButton buttonDivide;
    JButton buttonAdd;
    JButton buttonSub;
    JButton buttonDot;
    JButton buttonEqual;


    JLabel label;

    Calculator5(){
        setSize(300,400);
        setTitle("Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        setLayout(new GridLayout(4,4));

        button7=new JButton();
        button7.setText("7");
        button7.setFont(new Font("",1,25));
        add(button7);

        button8=new JButton();
        button8.setText("8");
        button8.setFont(new Font("",1,25));
        add(button8);

        button9=new JButton();
        button9.setText("9");
        button9.setFont(new Font("",1,25));
        add(button9);

        buttonMulti=new JButton();
        buttonMulti.setText("*");
        buttonMulti.setFont(new Font("",1,25));
        add(buttonMulti);


        button4=new JButton();
        button4.setText("4");
        button4.setFont(new Font("",1,25));
        add(button4);

        button5=new JButton();
        button5.setText("5");
        button5.setFont(new Font("",1,25));
        add(button5);

        button6=new JButton();
        button6.setText("6");
        button6.setFont(new Font("",1,25));
        add(button6);

        buttonDivide=new JButton();
        buttonDivide.setText("/");
        buttonDivide.setFont(new Font("",1,25));
        add(buttonDivide);

        button1=new JButton();
        button1.setText("1");
        button1.setFont(new Font("",1,25));
        add(button1);

        button2=new JButton();
        button2.setText("2");
        button2.setFont(new Font("",1,25));
        add(button2);

        button3=new JButton();
        button3.setText("3");
        button3.setFont(new Font("",1,25));
        add(button3);

        buttonAdd=new JButton();
        buttonAdd.setText("+");
        buttonAdd.setFont(new Font("",1,25));
        add(buttonAdd);

        button0=new JButton();
        button0.setText("0");
        button0.setFont(new Font("",1,25));
        add(button0);

        buttonDot=new JButton();
        buttonDot.setText(".");
        buttonDot.setFont(new Font("",1,25));
        add(buttonDot);

        buttonEqual=new JButton();
        buttonEqual.setText("=");
        buttonEqual.setFont(new Font("",1,25));
        add(buttonEqual);

        buttonSub=new JButton();
        buttonSub.setText("-");
        buttonSub.setFont(new Font("",1,25));
        add(buttonSub);

        setVisible(true);
    }
}
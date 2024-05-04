package Day10_Swing;

/**
 * Create calculator buttons in easy way
 */

import javax.swing.*;
import java.awt.*;

public class Q10{
    public static void main(String[] args) {

        Calculator6 c1 = new Calculator6(); // there are not class called Calculator then we have to do extend JFrame class and inherit

    }
}

class Calculator6 extends JFrame{ // inherit JFrame class

    JButton[] buttonArr;

    Calculator6(){
        setSize(300,400);
        setTitle("Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        setLayout(new GridLayout(4,4));
        buttonArr=new JButton[16];

        String[] nameArr={"7","8","9","*","4","5","6","/","1","2","3","+","0",".","=","-"};

        for (int i=0;i<buttonArr.length;i++){
            buttonArr[i]=new JButton(nameArr[i]);
            buttonArr[i].setFont(new Font("",1,25));
            add(buttonArr[i]);
        }
        setVisible(true);

    }
}
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
    Calculator(){
        setSize(500,400);
        setTitle("Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);


        button=new JButton();
        button.setText("Click");
        button.setFont(new Font("",1,25));
        add(button);

        setVisible(true);
    }
}
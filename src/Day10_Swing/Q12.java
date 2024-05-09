package Day10_Swing;

import javax.swing.*;
import java.awt.*;

public class Q12 {
    public static void main(String[] args) {
        Calculator8 c1 = new Calculator8();
    }
}
class Calculator8 extends JFrame { // inherit JFrame class

    JTextField textField;
    JButton[] buttonArr;


    Calculator8() {
        setSize(300, 400);
        setTitle("Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        Font font = new Font("", 1, 25);

        setLayout(new BorderLayout());

        textField = new JTextField();
        textField.setFont(new Font("", 1, 25));
        add("North", textField);


        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(4, 4));
        buttonArr = new JButton[16];


        String[] nameArr={"7","8","9","*","4","5","6","/","1","2","3","+","0",".","=","-"};

        for(int i =0; i < 16; i++){
            buttonArr[i] = new JButton(nameArr[i]);
            buttonArr[i].setFont(new Font("", 1, 20));
            buttonPanel.add(buttonArr[i]);
        }


        add("Center", buttonPanel);
        setVisible(true);
    }
}

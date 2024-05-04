package Day10_Swing;

import javax.swing.*;

public class Q4 {
    public static void main(String[] args) {

        Calculator c1 = new Calculator(); // there are not class called Calculator then we have to do extend JFrame class and inherit
        c1.setSize(500, 400);
        c1.setTitle("Calculator");
        c1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        c1.setLocationRelativeTo(null);
        c1.setVisible(true);
    }
}

class Calculator extends JFrame{ // inherit JFrame class

    // Now this Calculator class is a JFrame
    //Super class --> JFrame
    //Sub Class --> Calculator

}
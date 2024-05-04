package Day10_Swing;

/**
 * Create Swing Application
 */

import javax.swing.*;
import java.awt.*; // for import color

public class Q1 {
    public static void main(String[] args) {

        JFrame f1=new JFrame();
        f1.setSize(400,300);
        f1.setTitle("Test Window");
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f1.setLocationRelativeTo(null);
        f1.setVisible(true);

    }
}

//f1.getContentPane().setBackground( Color.YELLOW); --> set background color

//JFrame.EXIT_ON_CLOSE =3
//JFrame.DISPOSE_ON_CLOSE =2
//JFrame.HIDE_ON_CLOSE = 1
//JFrame.DO_NOTHING_ON_CLOSE = 0
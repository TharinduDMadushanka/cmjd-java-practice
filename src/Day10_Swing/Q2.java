package Day10_Swing;

/**
 * if Close values are equal in both tabs they close together
 */

import javax.swing.*;

public class Q2 {
    public static void main(String[] args) {

        JFrame f1=new JFrame();
        f1.setSize(400,300);
        f1.setTitle("Test 1 Window");
        f1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // close only this window
        f1.setLocationRelativeTo(null);
        f1.setVisible(true);

        JFrame f2=new JFrame();
        f2.setSize(700,600);
        f2.setTitle("Test 2 Window");
        f2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f2.setLocationRelativeTo(null);
        f2.setVisible(true);

    }
}

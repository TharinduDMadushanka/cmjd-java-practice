package Day10_Swing;

import javax.swing.*;
import java.awt.*;

public class Q3 {
    public static void main(String[] args) {

        JFrame f1 = new JFrame();

        f1.setSize(400, 300);
        f1.setTitle("My Frame");
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f1.setLocationRelativeTo(null);

        JButton b = new JButton(); // create object for create button
        b.setText("Click");
        b.setFont(new Font("",1,25));
        f1.add(b);

        f1.setVisible(true);

    }
}
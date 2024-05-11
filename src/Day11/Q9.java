package Day11;

import javax.swing.*;

/**
 * Inheritance
 */

public class Q9 {
    public static void main(String[] args) {

        JFrame f1 = new JFrame();
        f1.setSize(300, 300);
        f1.setTitle("Frame");
        f1.setVisible(true);

        Calculator c1 = new Calculator();
        c1.setSize(300, 300);
        c1.setTitle("Calculator");
        c1.setVisible(true);
    }

}

class Calculator extends JFrame {
// Calculator IS-A JFrame
}



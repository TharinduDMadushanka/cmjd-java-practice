package Day11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


class Q1 {
    public static void main(String[] args) {
        Calculator c1 = new Calculator();
    }

    static class Calculator extends JFrame {

        JButton button;

        Calculator() {
            setSize(500, 400);
            setTitle("Calculator");
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setLocationRelativeTo(null);

            button = new JButton();
            button.setText("Button");
            button.setFont(new Font("", 1, 25));

            button.addActionListener(new ActionListener(){ //interface
                @Override
                public void actionPerformed(ActionEvent e) {
                    System.out.println("You pressed a buton");
                }
            });

            add(button);

            setVisible(true);
        }
    }

}


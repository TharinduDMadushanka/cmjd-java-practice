package Day11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Q2 {
    public static void main(String[] args) {
        new SliderFrame();
    }

    static class SliderFrame extends JFrame {

        private JTextField textField;
        private JSlider slider;

        JButton button;

        SliderFrame() {
            setSize(500, 400);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setLocationRelativeTo(null);
            setLayout(new FlowLayout());

            textField=new JTextField(20);
            setFont(new Font("",1,20));
            add(textField);

            slider=new JSlider(JSlider.VERTICAL,0,100,50);
            slider.setMajorTickSpacing(10);
            slider.setPaintLabels(true);

            setVisible(true);
        }
    }

}


package Day11;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
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
            setSize(250, 300);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setLocationRelativeTo(null);
            setLayout(new FlowLayout());

            textField=new JTextField(20); //text field
            setFont(new Font("",1,20));
            add(textField);

            slider=new JSlider(JSlider.VERTICAL,0,100,50); //slider
            slider.setMajorTickSpacing(10);
            slider.setPaintLabels(true);
            add(slider);

            slider.addChangeListener(new ChangeListener() {
                @Override
                public void stateChanged(ChangeEvent e) {
                    int value= slider.getValue();
                    textField.setText(value+""); //Integer.toString(value)
                }
            });

            setVisible(true);
        }
    }

}

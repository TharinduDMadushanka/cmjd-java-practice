package Day11;

/**
 * Create two display menu 1--> slider 2--> text field
 */

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class Q3 {
    public static void main(String[] args) {
        DisplayFrame displayFrame=new DisplayFrame();
        SliderFrame2 c1 =new SliderFrame2(displayFrame);
    }
}
class SliderFrame2 extends JFrame {
    private JSlider slider;
    private DisplayFrame displayFrame;

    SliderFrame2(DisplayFrame displayFrame) {

        this.displayFrame=displayFrame;
        setSize(250, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout());

        slider=new JSlider(JSlider.VERTICAL,0,100,50); //slider
        slider.setMajorTickSpacing(10);
        slider.setPaintLabels(true);
        add(slider);

        slider.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                int value= slider.getValue();
                displayFrame.textField.setText(Integer.toString(value)); //Integer.toString(value)
            }
        });


        setVisible(true);
    }
}
class DisplayFrame extends JFrame{
    JTextField textField;

    DisplayFrame(){
        setSize(250, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout());

        textField = new JTextField(10);
        textField.setFont(new Font("", 1, 20));
        add(textField);
        setVisible(true);
    }
}


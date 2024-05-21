package Day11_projects;

/**
 * Create water tank water level monitoring program
 */

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class Q1 {
    public static void main(String[] args) {
        WaterTankController waterTankController = new WaterTankController();
        waterTankController.setAlarmWindow(new AlarmWindow());
        waterTankController.setDisplayWindow(new DisplayWindow());
        waterTankController.setSplitterWindow(new SplitterWindow());
        waterTankController.setSMSWindow(new SMSWindow());

        WaterTankWindow waterTankWindow = new WaterTankWindow(waterTankController);

    }
}

/**
 * create Display menu gui for water level slider
 */
class DisplayWindow extends JFrame {
    private JLabel displayLable;
    private int waterLevel;

    DisplayWindow() {
        setSize(300, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout());
        setTitle("Display Window");

        displayLable = new JLabel("50");
        displayLable.setFont(new Font("", 1, 35));
        add(displayLable);

        setVisible(true);
    }

    public void setDisplayLabelValue(int waterLevel) {
        this.displayLable.setText(Integer.toString(waterLevel));
    }
}

/**
 * Create alarm window
 */
class AlarmWindow extends JFrame {
    private JLabel alarmLable;
    private int waterLevel;

    AlarmWindow() {
        setSize(300, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout());
        setTitle("Alarm Window");

        alarmLable = new JLabel("OFF");
        alarmLable.setFont(new Font("", 1, 35));
        add(alarmLable);

        setVisible(true);
    }

    public void setAlarmLabelValue(int waterLevel) {
        this.alarmLable.setText(waterLevel > 50 ? "ON" : "OFF");
    }
}

/**
 * Splitter window
 */

class SplitterWindow extends JFrame {
    private JLabel splitterLable;
    private int waterLevel;


    SplitterWindow() {
        setSize(300, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout());
        setTitle("Alarm Window");

        splitterLable = new JLabel("OFF");
        splitterLable.setFont(new Font("", 1, 35));
        add(splitterLable);

        setVisible(true);
    }

    public void setSplitterLabelValue(int waterLevel) {
        this.splitterLable.setText(waterLevel > 75 ? "ON" : "OFF");
    }
}

class WaterTankController {
    private DisplayWindow displayWindow;
    private AlarmWindow alarmWindow;
    private SplitterWindow splitterWindow;
    private SMSWindow smsWindow;

    private int waterLevel;

    public void setDisplayWindow(DisplayWindow displayWindow) {
        this.displayWindow = displayWindow;
    }

    public void setAlarmWindow(AlarmWindow alarmWindow) {
        this.alarmWindow = alarmWindow;
    }

    public void setSplitterWindow(SplitterWindow splitterWindow) {
        this.splitterWindow = splitterWindow;
    }

    public void setSMSWindow(SMSWindow smsWindow){
        this.smsWindow = smsWindow;
    }


    public void setWaterLevel(int waterLevel) {
        if (this.waterLevel != waterLevel) {
            this.waterLevel = waterLevel;
            notifyObject();
        }
    }

    public void notifyObject() {
        displayWindow.setDisplayLabelValue(waterLevel);
        alarmWindow.setAlarmLabelValue(waterLevel);
        splitterWindow.setSplitterLabelValue(waterLevel);
        smsWindow.sendSMS(waterLevel);
    }
}


/**
 * water tank window
 */
class WaterTankWindow extends JFrame {
    private JSlider waterLevelSlider;

    private WaterTankController waterTankController;

    WaterTankWindow(WaterTankController waterTankController) {
        setSize(300, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout());
        setTitle("Water Tank Window");

        this.waterTankController = waterTankController;

        waterLevelSlider = new JSlider(JSlider.VERTICAL, 0, 100, 50);
        waterLevelSlider.setMajorTickSpacing(10);
        waterLevelSlider.setPaintLabels(true);

        waterLevelSlider.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                int waterLevel = waterLevelSlider.getValue();
                waterTankController.setWaterLevel(waterLevel);
            }
        });

        add(waterLevelSlider);

        setVisible(true);
    }
}
class SMSWindow extends JFrame{
    private JLabel smsLabel;

    SMSWindow(){
        setSize(300,300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout());
        setTitle("SMS Window");

        smsLabel = new JLabel();
        smsLabel.setFont(new Font("", 1, 25));
        add(smsLabel);

        setVisible(true);
    }

    public void sendSMS(int waterLevel){
        smsLabel.setText("Sending SMS : " + waterLevel);
    }
}

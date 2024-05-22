package Day_12._OOP4;

/**
 * Create water tank water level monitoring program
 */

import javax.swing.*;
import java.awt.*;

import javax.swing.event.*;
import java.awt.event.*;

class WaterLevelObserver extends JFrame{
    public void update(int waterLevel){
        //
    }
}

class SMSWindow extends WaterLevelObserver{
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

    public void update(int waterLevel){
        smsLabel.setText("Sending SMS : " + waterLevel);
    }
}


class DisplayWindow extends WaterLevelObserver{
    private JLabel displayLabel;

    DisplayWindow(){
        setSize(300,300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout());
        setTitle("Display Window");

        displayLabel = new JLabel("50");
        displayLabel.setFont(new Font("", 1, 35));
        add(displayLabel);

        setVisible(true);
    }

    public void update(int waterLevel){
        this.displayLabel.setText(Integer.toString(waterLevel));
    }
}

class AlarmWindow extends WaterLevelObserver{
    private JLabel alarmLabel;

    AlarmWindow(){
        setSize(300,300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout());
        setTitle("Alarm Window");

        alarmLabel = new JLabel("Off");
        alarmLabel.setFont(new Font("", 1, 35));
        add(alarmLabel);

        setVisible(true);
    }

    public void update(int waterLevel){
        this.alarmLabel.setText(waterLevel > 50? "On" : "Off");
    }
}

class SplitterWindow extends WaterLevelObserver{
    private JLabel splitterLabel;

    SplitterWindow(){
        setSize(300,300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout());
        setTitle("Splitter Window");

        splitterLabel = new JLabel("Off");
        splitterLabel.setFont(new Font("", 1, 35));
        add(splitterLabel);

        setVisible(true);
    }

    public void update(int waterLevel){
        this.splitterLabel.setText(waterLevel > 75? "On" : "Off");
    }
}

class WaterTankController{
    private WaterLevelObserver[] observers = new WaterLevelObserver[0];

    private int waterLevel;

    public void addWaterLevelObserver(WaterLevelObserver waterLevelObserver){
        WaterLevelObserver[] temp = new WaterLevelObserver[observers.length + 1];
        for(int i =0; i < observers.length; i++){
            temp[i] = observers[i];
        }
        temp[temp.length-1] = waterLevelObserver;
        observers = temp;
    }


    public void setWaterLevel(int waterLevel){
        if(this.waterLevel != waterLevel){
            this.waterLevel = waterLevel;
            notifyObject();
        }
    }

    public void notifyObject(){
        for (WaterLevelObserver waterLevelObserver : observers) {
            waterLevelObserver.update(waterLevel);
        }
    }
}


class WaterTankWindow extends JFrame{
    private JSlider waterLevelSlider;

    private WaterTankController waterTankController;

    WaterTankWindow(WaterTankController waterTankController){
        setSize(300,300);
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

class Example {
    public static void main(String[] args) {
        WaterTankController waterTankController = new WaterTankController();
        waterTankController.addWaterLevelObserver(new AlarmWindow());
        waterTankController.addWaterLevelObserver(new DisplayWindow());
        waterTankController.addWaterLevelObserver(new SplitterWindow());
        waterTankController.addWaterLevelObserver(new SMSWindow());

        WaterTankWindow waterTankWindow = new WaterTankWindow(waterTankController);
    }
}


package Day11;

import javax.swing.*;

public class Q10 {
    public static void main(String[] args) {
        new Calc();
    }
}
class Calc extends JFrame{ //inherit J Frame byte code for Calc class

    Calc(){
        setSize(300,300);//Legal
        setTitle("Calc");
        setVisible(true);
    }
}
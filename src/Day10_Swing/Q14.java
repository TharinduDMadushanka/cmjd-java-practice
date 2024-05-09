package Day10_Swing;

/**
 * Java Menu, MenuItem
 */

import java.awt.*;
import javax.swing.*;


public class Q14 {
    public static void main(String[] args) {
        Notepad n1=new Notepad();
    }
}
class Notepad extends JFrame{

    TextArea textArea;
    JMenuBar mainMenu;
    JMenu fileMenu, editMenu, viewMenu;
    JMenuItem item1, item2, item3, item4, item5, item6;

    Notepad(){
        setSize(600, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Untitled");
        setLocationRelativeTo(null);

        mainMenu = new JMenuBar();

        // file
        fileMenu = new JMenu("File");
        item1 = new JMenuItem("Item 1");
        fileMenu.add(item1);

        item2 = new JMenuItem("Item 2");
        fileMenu.add(item2);

        mainMenu.add(fileMenu);

        //edit
        editMenu = new JMenu("Edit");
        item3 = new JMenuItem("Item 3");
        editMenu.add(item3);

        item4 = new JMenuItem("Item 4");
        editMenu.add(item4);

        mainMenu.add(editMenu);

        //view

        viewMenu =new JMenu("View");
        item5=new JMenuItem("Item 5");
        viewMenu.add(item5);

        item6=new JMenuItem("Item 6");
        viewMenu.add(item6);

        mainMenu.add(viewMenu);

        setJMenuBar(mainMenu);


        textArea = new TextArea();
        textArea.setFont(new Font("", 1, 15));
        add("Center", textArea);

        JScrollPane jScrollPane = new JScrollPane(textArea);
        add("Center", jScrollPane);


        setVisible(true);
    }
}


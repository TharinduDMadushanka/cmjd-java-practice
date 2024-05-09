package Day10_Swing;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/**
 * Working with JTable
 */

public class Q15 {
    public static void main(String[] args) {
        ViewCustomer v1=new ViewCustomer();
    }
}

class ViewCustomer extends JFrame {

    DefaultTableModel dtm;
    JTable customerTable;

    ViewCustomer(){
        setSize(600,500);
        setTitle("View Customer");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        String[] columns={"id","Name","Address","Nic"};
        dtm=new DefaultTableModel(columns,0);

        customerTable=new JTable(dtm);
        String[] rowData1={"001","Tharindu","Galle","1123456 v"};
        String rowData2[] = {"C001", "Customer 1", "Panadura", "987765434V"};

        dtm.addRow(rowData1);
        dtm.addRow(rowData2);


        JScrollPane scrollPane=new JScrollPane(customerTable);
        add(scrollPane);

        setVisible(true);
    }
}

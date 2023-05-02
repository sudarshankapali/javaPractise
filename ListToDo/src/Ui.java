import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ui implements ActionListener {
    DefaultTableModel tab = new DefaultTableModel();
    JFrame frame = new JFrame("Phonebook");
    JLabel label = new JLabel("Info");
    JLabel label1 = new JLabel("Name");
    JLabel label2 = new JLabel("City");
    JLabel label3 = new JLabel("Phone");
    JTextField name = new JTextField();
    JTextField city = new JTextField();
    JTextField phone = new JTextField();
    JButton insert = new JButton("Insert");
    JButton reset = new JButton("Reset");
    String[] columnName = {"Name","Age","Gender"};
    String[] data = {"Sudarshan","22","male"};


    public  Ui(){
        tab.addColumn("Name");
        tab.addColumn("Phone");
        tab.addColumn("City");

        label.setBounds(10,1,50,20);
        label1.setBounds(60,20,50,20);
        label2.setBounds(60,40,50,20);
        label3.setBounds(60,60,50,20);

        frame.add(label);
        frame.add(label1);
        frame.add(label2);
        frame.add(label3);

        name.setBounds(100,20,100,20);
        city.setBounds(100,40,100,20);
        phone.setBounds(100,60,100,20);

        frame.add(name);
        frame.add(city);
        frame.add(phone);

        insert.setBounds(80,80,70,20);
        reset.setBounds(150,80,70,20);

        frame.add(insert);
        frame.add(reset);

        JTable table = new JTable( data,columnName);
        frame.add(table);
        
        frame.setLayout(null);
        frame.setSize(500,500);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}

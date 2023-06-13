import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calc implements ActionListener {
    JFrame frame = new JFrame("Calculator");
    JLabel l1 = new JLabel("Number 1");
    JLabel l2 = new JLabel("Number 2");
    JLabel l3 = new JLabel("Sum");
    JTextField t1 = new JTextField();
    JTextField t2 = new JTextField();
    JTextField t3 = new JTextField();
    JButton btn = new JButton("ADD");
    public  void render(){
        l1.setBounds(0,10,70,20);
        l2.setBounds(0,30,70,20);
        l3.setBounds(0,50,70,20);

        t1.setBounds(70,10,100,20);
        t2.setBounds(70,30,100,20);
        t3.setBounds(70,50,100,20);

        btn.setBounds(50,80,60,20);
        btn.addActionListener(this);

        frame.add(l1);
        frame.add(l2);
        frame.add(l3);

        frame.add(t1);
        frame.add(t2);
        frame.add(t3);

        frame.add(btn);

        frame.setSize(400,400);
        frame.setResizable(false);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        int num1 = Integer.parseInt(t1.getText());
        int num2 = Integer.parseInt(t2.getText());
        int num3 = num1 + num2;
        t3.setText(String.valueOf(num3));

    }
}

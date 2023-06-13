import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorGUI implements ActionListener {
    JFrame frame = new JFrame("Calculator");
    JTextField t1 = new JTextField();
    JTextField t2 = new JTextField();
    JTextField t3 = new JTextField();
    JLabel n1 = new JLabel("Number 1");
    JLabel n2 = new JLabel("Number 2");
    JLabel result = new JLabel("Sum");


    JButton btn = new JButton("add");


    void render(){
        n1.setBounds(0,10,70,20);
        frame.add(n1);
        n2.setBounds(0,30,70,20);
        frame.add(n2);
        t1.setBounds(70,10,100,20);
//        t1.setText("Sudarshan");
        frame.add(t1);
        System.out.println(t1.getText());

        t2.setBounds(70,30,100,20);
//        t2.setText("Sudarshan");
        frame.add(t2);
        result.setBounds(30,50,70,20);
        frame.add(result);
        t3.setBounds(70,50,100,20);
//        t3.setText("Sudarshan");
        frame.add(t3);



        btn.setBounds(10,90,70,20);
        btn.addActionListener(this);
        frame.add(btn);


        frame.setSize(400,400);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        int num1 = Integer.parseInt(t1.getText());
        int num2 = Integer.parseInt(t2.getText());
        int num3 = num1+num2;
        t3.setText(String.valueOf(num3));

    }
}

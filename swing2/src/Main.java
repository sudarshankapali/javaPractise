import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("new frame");
        TextField textField = new TextField("enter your username");
        textField.setBounds(20,30,300,50);
        frame.add(textField);

        JLabel label = new JLabel("enter your password here");
        label.setBounds(20,80,150,25);
        frame.add(label);

        JPasswordField password = new JPasswordField("Enter your password");
        password.setBounds(20,100,300,50);
        frame.add(password);
        JButton submmit = new JButton("Login");
        submmit.setBounds(100,150,100,50);
        submmit.setForeground(Color.red);
        frame.add(submmit);

        String[] bikes = {"cbr","bmw","benelli"};
        JComboBox combo = new JComboBox(bikes);
        combo.setBounds(20,200,300,25);
        frame.add(combo);

        frame.setLayout(null);
        frame.setResizable(false);
        frame.setSize(400,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setVisible(true);
    }
}
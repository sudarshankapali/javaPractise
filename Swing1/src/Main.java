import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("hell world");
        JButton button = new JButton("click");
        button.setBounds(10,10,100,100);
        frame.add(button);

        frame.setTitle("okok");
        frame.setResizable(false);

        frame.setSize(400,400);
        frame.getContentPane().setBackground(Color.red);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
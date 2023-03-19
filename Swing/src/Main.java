//import javax.swing.*;
//
//public class Main {
//    public static void main(String[] args) {
//        JFrame frame = new JFrame("Hello World");
//        JButton button = new JButton("Click me");
//        button.setBounds(100,200,100,50);
//        frame.add(button);
//
//
//        JTextField textField = new JTextField("Write here");
//        textField.setBounds(75,125,200,50);
//        frame.add(textField);
//
//
//        frame.setSize(400,500);
//        frame.setLayout(null);
//        frame.setVisible(true);
//    }
//}

import java.awt.*;
import javax.swing.JFrame;

public class Main extends Canvas{

    public void paint(Graphics g) {
        g.drawString("Hello",40,40);
        setBackground(Color.WHITE);
        g.fillRect(130, 30,100, 80);
        g.drawOval(30,130,50, 60);
        setForeground(Color.RED);
        g.fillOval(130,130,50, 60);
        g.drawArc(30, 200, 40,50,90,60);
        g.fillArc(30, 130, 40,50,180,40);

    }
    public static void main(String[] args) {
        Main m=new Main();
        JFrame f=new JFrame();
        f.add(m);
        f.setSize(400,400);
        //f.setLayout(null);
        f.setVisible(true);
    }

}
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Hello World");
        JButton button = new JButton("Click me");
        button.setBounds(100,200,100,50);
        frame.add(button);


        JTextField textField = new JTextField("Write here");
        textField.setBounds(75,125,200,50);
        frame.add(textField);


        frame.setSize(400,500);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
//
//import java.awt.*;
//import javax.swing.JFrame;
//
//public class Main extends Canvas{
//        public void paint(Graphics g) {
//            setBackground(Color.WHITE);
//            g.fillRect(130, 30,50, 50);
//            g.clearRect(130,30,50,50);
//            for(int i=0;i<400;i++){
//                int xpos= 130+i;
//                int ypos= 30+i;
//                int lastx = xpos-1;
//                int lasty = ypos-1;
//
//                g.fillRect(xpos, ypos,50, 50);
//                g.clearRect(lastx,lasty,50,50);
//            }
//            setForeground(Color.RED);
//        }
//    public static void main(String[] args) {
//        Main m=new Main();
//        JFrame f=new JFrame();
//        f.add(m);
//        f.setSize(400,400);
//        //f.setLayout(null);
//        f.setVisible(true);
//    }
//}

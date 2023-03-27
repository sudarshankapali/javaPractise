import javax.swing.*;
import java.awt.*;

public class Layout {
    JFrame frame = new JFrame();
    JPanel p1 = new JPanel();
    JPanel p2 = new JPanel();
    JPanel p3 = new JPanel();
    JPanel p4 = new JPanel();
    JPanel p5 = new JPanel();



    public void render(){
        p1.setBackground(Color.red);
        frame.setLayout(new BorderLayout());
        p1.add(new JButton("click me"));
        p1.add(new JButton("click me"));
        p1.add(new JButton("click me"));
        p1.setLayout(new BoxLayout(p1,BoxLayout.Y_AXIS));
        frame.add(p1,BorderLayout.WEST);

        p2.setBackground(Color.GREEN);
        p2.add(new JButton("click me"));
        frame.add(p2,BorderLayout.EAST);

        p3.setBackground(Color.YELLOW);
        p3.setLayout(new FlowLayout(FlowLayout.LEFT));
        p3.add(new JButton("click me1"));
        p3.add(new JButton("click me2"));
        p3.add(new JButton("click me3"));
        frame.add(p3,BorderLayout.NORTH);

        p4.setBackground(Color.BLUE);
        p4.add(new JButton("click me"));
        frame.add(p4,BorderLayout.SOUTH);

        p5.add(new JButton("click me3"));
        p5.add(new JButton("click me3"));
        p5.add(new JButton("click me3"));
        p5.setLayout(new GridLayout(2,2));
        p5.setBackground(Color.CYAN);


        frame.add(p5,BorderLayout.CENTER);

        frame.setSize(400,400);
        frame.setTitle("Layout");
//        frame.setLayout(null);
//        frame.setResizable(false);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

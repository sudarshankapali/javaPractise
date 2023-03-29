import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Box extends JPanel implements ActionListener {
    int boxX=10;
    int boxY =10;
    Box(){
        JButton btn = new JButton("Move box");
        btn.addActionListener(this);
        add(btn);
    }
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.red);
        g.fillRect(boxX,boxY,100,100);

        g.setColor(Color.blue);
        g.fillRect(200,10,100,100);

        g.setColor(Color.green);
        g.fillRect(10,200,100,100);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        boxX +=10;
        boxY+=10;
        repaint();
    }
}

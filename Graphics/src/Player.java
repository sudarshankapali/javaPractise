import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Player extends JPanel implements ActionListener {
    int boxX=10;
    int boxY =10;
    Player(){
        JButton btn = new JButton("Move Mario");
        btn.setBounds(50,180,60,20);
        btn.addActionListener(this);
        add(btn);
    }
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.red);
        g.fillRect(50+boxX,10,40,10);
        g.fillRect(40+boxX,20,70,10);
        g.setColor(Color.black);
        g.fillRect(40+boxX,30,30,10);
        g.setColor(Color.orange);
        g.fillRect(70+boxX,30,10,10);
        g.setColor(Color.black);
        g.fillRect(80+boxX,30,10,20);
        g.setColor(Color.orange);
        g.fillRect(90+boxX,30,10,10);
        g.setColor(Color.black);
        g.fillRect(30+boxX,40,10,30);
        g.setColor(Color.orange);
        g.fillRect(40+boxX,40,10,20);
        g.setColor(Color.black);
        g.fillRect(50+boxX,40,10,20);
        g.setColor(Color.orange);
        g.fillRect(60+boxX,40,20,10);
        g.fillRect(90+boxX,40,20,10);
        g.setColor(Color.black);
        g.fillRect(60+boxX,50,10,10);
        g.setColor(Color.orange);
        g.fillRect(70+boxX,50,20,10);
        g.setColor(Color.black);
        g.fillRect(90+boxX,50,10,10);
        g.setColor(Color.orange);
        g.fillRect(100+boxX,50,20,10);
        g.setColor(Color.black);
        g.fillRect(40+boxX,60,10,10);
        g.setColor(Color.orange);
        g.fillRect(50+boxX,60,30,10);
        g.setColor(Color.black);
        g.fillRect(80+boxX,60,30,10);
        g.setColor(Color.orange);
        g.fillRect(50+boxX,70,50,10);
        g.setColor(Color.red);
        g.fillRect(40+boxX,80,50,10);
        g.fillRect(30+boxX,90,80,10);
        g.fillRect(20+boxX,100,100,10);
        g.setColor(Color.orange);
        g.fillRect(20+boxX,110,20,30);
        g.setColor(Color.red);
        g.fillRect(40+boxX,110,20,10);
        g.setColor(Color.white);
        g.fillRect(60+boxX,110,10,10);
        g.setColor(Color.red);
        g.fillRect(70+boxX,110,20,10);
        g.setColor(Color.white);
        g.fillRect(90+boxX,110,10,10);
        g.setColor(Color.red);
        g.fillRect(100+boxX,110,10,10);
        g.setColor(Color.orange);
        g.fillRect(110+boxX,110,20,30);
        g.fillRect(40+boxX,120,10,10);
        g.setColor(Color.red);
        g.fillRect(50+boxX,120,50,10);
        g.setColor(Color.orange);
        g.fillRect(100+boxX,120,10,10);
        g.setColor(Color.red);
        g.fillRect(40+boxX,130,70,10);
        g.fillRect(40+boxX,140,25,10);
        g.fillRect(85+boxX,140,25,10);
        g.setColor(Color.black);
        g.fillRect(30+boxX,150,25,10);
        g.fillRect(95+boxX,150,25,10);
        g.fillRect(20+boxX,160,35,10);
        g.fillRect(95+boxX,160,35,10);

    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        boxX +=10;
        boxY+=10;
        repaint();
    }
}

package Main;

import Inputs.KeyboardInputs;
import Inputs.MouseInputs;

import javax.swing.*;
import java.awt.*;

public class Player extends JPanel {
    private MouseInputs mouseInputs = new MouseInputs(this);
    public int xDelta = 100,yDelta = 100;
    public Player(){
        addKeyListener(new KeyboardInputs(this));
        addMouseListener(mouseInputs);
        addMouseMotionListener(mouseInputs);
    }
    public void changeXdelta(int value){
        this.xDelta +=value;
        repaint();
    }
    public void changeYdelta(int value){
        this.yDelta +=value;
        repaint();
    }
    public void setRectPos(int x, int y){
        this.xDelta = x;
        this.yDelta = y;
        repaint();
    }
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.fillRect(xDelta,yDelta,150,50);
    }
}

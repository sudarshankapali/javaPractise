package main;

import inputs.MouseInputs;
import inputs.keyboardInputs;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;


public class GamePanel extends JPanel {
    private float xDelta=100,yDelta=100;
    private MouseInputs mouseInputs;
    private int frames = 0;
    private long lastCheck = 0;
    private float xDir = 0.9f,yDir = 0.9f;
    private BufferedImage img,subImg;

    public GamePanel(){
        importImg();
        mouseInputs = new MouseInputs(this);
        setPanelSize();
        addKeyListener(new keyboardInputs(this));
        addMouseListener(mouseInputs);
        addMouseMotionListener(mouseInputs);
    }

    private void importImg() {
        InputStream is = getClass().getResourceAsStream("/player_sprites.png");
        try {
            img = ImageIO.read(is);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void setPanelSize() {
        Dimension size = new Dimension(1280,800);
        setMinimumSize(size);
        setPreferredSize(size);
        setMaximumSize(size);
    }

    public void changeXdelta(int value){
this.xDelta+=value;
}
public void changeYdelta(int value){
this.yDelta+=value;
}
public void setRectPos(int x,int y){
this.xDelta = x;
this.yDelta = y;
}
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
//        g.drawImage(img.getSubimage(0,0,64,40),0,0,128,80,null);
        subImg = img.getSubimage(1*64,8*40,64,40);
        g.drawImage(subImg,(int)xDelta,(int)yDelta,128,80,null);
        frames++;
                if(System.currentTimeMillis() - lastCheck >= 1000){
                    lastCheck = System.currentTimeMillis();
                    System.out.println("FPS: "+frames);
                    frames=0;
                }
//        repaint();
    }

}

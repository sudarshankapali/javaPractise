package main;

import inputs.MouseInputs;
import inputs.keyboardInputs;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;

import static utilz.Constants.Directions.*;
import static  utilz.Constants.PlayerConstants.*;


public class GamePanel extends JPanel {
    private float xDelta=100,yDelta=100;
    private MouseInputs mouseInputs;
    private int frames = 0;
    private long lastCheck = 0;
    private float xDir = 0.9f,yDir = 0.9f;
    private BufferedImage img;
    private BufferedImage[][] animations;
    private int aniTick,aniIndex,aniSpeed=15;
    private int playerAction = IDLE;
    private int playerDir = -1;
    private boolean moving = false;


    public GamePanel(){
        importImg();
        loadAnimations();
        mouseInputs = new MouseInputs(this);
        setPanelSize();
        addKeyListener(new keyboardInputs(this));
        addMouseListener(mouseInputs);
        addMouseMotionListener(mouseInputs);
    }

    private void loadAnimations() {
        animations = new BufferedImage[9][6];
        for(int j=0; j<animations.length; j++)
        for(int i=0;i<animations[j].length;i++)
            animations[j][i] = img.getSubimage(i * 64, j*40, 64, 40);
    }

    private void importImg() {
        InputStream is = getClass().getResourceAsStream("/player_sprites.png");
        try {
            img = ImageIO.read(is);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            try{
                is.close();
            }catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        }

    private void setPanelSize() {
        Dimension size = new Dimension(1280,800);
        setMinimumSize(size);
        setPreferredSize(size);
        setMaximumSize(size);
    }
public void setDirection(int direction){
        this.playerDir = direction;
        moving = true;
}
public void setMoving(boolean moving){
        this.moving = moving;
}
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
//        g.drawImage(img.getSubimage(0,0,64,40),0,0,128,80,null);
        updateAnimationTick();
        setAnimation();
        updatePos();
        g.drawImage(animations[playerAction][aniIndex],(int)xDelta,(int)yDelta,256,160,null);
        frames++;
                if(System.currentTimeMillis() - lastCheck >= 1000){
                    lastCheck = System.currentTimeMillis();
                    System.out.println("FPS: "+frames);
                    frames=0;
                }
//        repaint();
    }

    private void updatePos() {
        if(moving){
            switch (playerDir){
                case LEFT:
                    xDelta -= 5;
                    break;
                case UP:
                    yDelta -= 5;
                    break;
                case RIGHT:
                    xDelta += 5;
                    break;
                case DOWN:
                    yDelta += 5;
                    break;
            }
        }
    }

    private void setAnimation() {
        if(moving)
            playerAction = RUNNING;
        else
            playerAction = IDLE;
    }

    private void updateAnimationTick() {
        aniTick++;
        if(aniTick >= aniSpeed){
            aniTick = 0;
            aniIndex++;
            if(aniIndex >= GetSpriteAmount(playerAction)){
                aniIndex = 0;

            }
        }

    }

}

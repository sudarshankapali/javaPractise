package Inputs;

import Main.Player;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyboardInputs implements KeyListener {
private Player player;
    public KeyboardInputs(Player player) {
        this.player = player;

    }


    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()){
            case KeyEvent.VK_A:
                System.out.println("its a");
                player.changeXdelta(-5);
                break;
            case KeyEvent.VK_S:
                System.out.println("its s");
                player.changeYdelta(5);
                break;
            case KeyEvent.VK_D:
                System.out.println("its d");
                player.changeXdelta(5);
                break;
            case KeyEvent.VK_W:
                System.out.println("its w");
                player.changeYdelta(-5);
            break;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}

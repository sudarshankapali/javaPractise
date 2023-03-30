import javax.swing.*;

public class GameManager {
    JFrame frame = new JFrame();
    Player box = new Player();
    public void GUIrender(){
        frame.add(box);
        frame.setSize(400,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

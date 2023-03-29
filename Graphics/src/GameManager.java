import javax.swing.*;

public class Render {
    JFrame frame = new JFrame();
    Box box = new Box();
    public void GUIrender(){
        frame.add(box);
        frame.setSize(400,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

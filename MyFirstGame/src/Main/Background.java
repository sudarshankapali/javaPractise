package Main;

import javax.swing.*;

public class Background {
    public Background(Player player){
        JFrame jFrame= new JFrame();
        jFrame.setSize(400,400);
        jFrame.add(player);
        jFrame.setLocationRelativeTo(null);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);
    }
}

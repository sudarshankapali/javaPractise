import java.applet.Applet;
import java.awt.*;

public class HelloApplet extends Applet {
    @Override
    public void paint(Graphics g) {
        String message = getParameter("message");
        g.drawString(message,20,20);
    }
}

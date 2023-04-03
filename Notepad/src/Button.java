import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Button extends JPanel implements ActionListener {
    JButton button = new JButton("Save in file");
    InterfaceOfNotepad interfaceOfNotepad = new InterfaceOfNotepad();

    public Button(){
        add(button);
        button.addActionListener(this::actionPerformed);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        interfaceOfNotepad.writeToNotepad();
    }
}

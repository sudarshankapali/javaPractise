import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class InterfaceOfNotepad {
   static JFrame frame = new JFrame("Notepad");
   static JTextArea area = new JTextArea();
    public void Text1(Button b){
        frame.add(b,BorderLayout.SOUTH);
        frame.setSize(400,400);
        frame.add(area);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        }
    public  void writeToNotepad(){
        String str = area.getText();
        try{
            File file = new File("sudarshan.txt");
            file.createNewFile();
            FileWriter fileWriter = new FileWriter("sudarshan.txt");
            fileWriter.write(str);
            fileWriter.close();

        }
        catch (IOException e1){
            System.out.println("Error while writing in file");
        }
    }

    }


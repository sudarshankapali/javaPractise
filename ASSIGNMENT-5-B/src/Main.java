import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main extends JFrame {
    private int counter = 1;
    private JLabel counterLabel;

    public Main() {
        // Set up the frame
        setTitle("Counter");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 500);
        setLocationRelativeTo(null);

        // Create the label
        counterLabel = new JLabel("Counter: " + counter);
        counterLabel.setFont(new Font("Arial", Font.BOLD, 24));
        counterLabel.setHorizontalAlignment(JLabel.CENTER);
        add(counterLabel, BorderLayout.CENTER);

        // Create the buttons
        JButton incButton = new JButton("ADD(+)");
        incButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                counter++;
                counterLabel.setText("Counter: " + counter);
            }
        });

        JButton decButton = new JButton("SUBTRACT(-)");
        decButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                counter--;
                counterLabel.setText("Counter: " + counter);
            }
        });

        // Add the buttons to a panel
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(1, 2, 10, 0));
        buttonPanel.add(incButton);
        buttonPanel.add(decButton);
        add(buttonPanel, BorderLayout.SOUTH);

        // Show the frame
        setVisible(true);
    }

    public static void main(String[] args) {
        new Main();
    }
}

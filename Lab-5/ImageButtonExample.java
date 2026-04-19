package Lab05;
/* Develop a Swing program in Java to display a message “Digital Clock is pressed” or
“Hour Glass is pressed” depending upon the Jbutton with image either Digital Clock
or Hour Glass is pressed by implementing the event handling mechanism with
addActionListener( ).*/
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ImageButtonExample implements ActionListener {

    JLabel label;
    JButton digitalBtn, hourglassBtn;

    ImageButtonExample() {
        JFrame frame = new JFrame("Image Button Example");

        // Label
        label = new JLabel("Click a button", JLabel.CENTER);
        label.setFont(new Font("Arial", Font.BOLD, 20));
        label.setBounds(50, 50, 400, 50);

        // Load images (make sure images are in same folder or give full path)
        ImageIcon digitalIcon = new ImageIcon("src/Lab05/digitalclock.png");
        ImageIcon hourglassIcon = new ImageIcon("src/Lab05/glassclock.png");

        // Buttons with images
        digitalBtn = new JButton(digitalIcon);
        hourglassBtn = new JButton(hourglassIcon);

        digitalBtn.setBounds(70, 150, 120, 120);
        hourglassBtn.setBounds(250, 150, 120, 120);

        // Add ActionListener
        digitalBtn.addActionListener(this);
        hourglassBtn.addActionListener(this);

        // Add components
        frame.add(label);
        frame.add(digitalBtn);
        frame.add(hourglassBtn);

        // Frame settings
        frame.setSize(450, 350);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }

    // Event Handling
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == digitalBtn) {
            label.setText("Digital Clock is pressed");
        } else if (e.getSource() == hourglassBtn) {
            label.setText("Hour Glass is pressed");
        }
    }

    public static void main(String[] args) {
        new ImageButtonExample();
    }
}
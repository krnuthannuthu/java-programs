package Lab05;
/*Basic hello program of Swing displaying the message Hello! VI C , Welcome to
Swing Programming in Blue color plain font with font size of 32 using Jframe and
Jlabel*/
import java.awt.Color;
import java.awt.Font;
import javax.swing.*;

class SwingExample {

    SwingExample() {

        // Create JFrame
        JFrame jfrm = new JFrame("A Simple Swing Application");

        // Set size
        jfrm.setSize(600, 200);

        // Close operation
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create JLabel
        JLabel jlab = new JLabel("Hello! VI C, Welcome to Swing Programming!", JLabel.CENTER);

        // Set font
        jlab.setFont(new Font("Verdana", Font.PLAIN, 32));

        // Set text color
        jlab.setForeground(new Color(0, 0, 255));

        // Add label
        jfrm.add(jlab);

        // Make visible
        jfrm.setVisible(true);
    }

    public static void main(String args[]) {

        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new SwingExample();
            }
        });
    }
}
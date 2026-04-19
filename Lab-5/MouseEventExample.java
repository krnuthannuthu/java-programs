package Lab05;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MouseEventExample {

    JLabel label;

    MouseEventExample() {
        JFrame frame = new JFrame("Mouse Event Example");

        // Label to display messages
        label = new JLabel("Perform mouse action on the button", JLabel.CENTER);
        label.setFont(new Font("Arial", Font.BOLD, 16));
        label.setBounds(50, 50, 400, 50);

        // Button
        JButton button = new JButton("Click Me");
        button.setBounds(150, 150, 150, 60);

        // Mouse Listener
        button.addMouseListener(new MouseListener() {

            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 2) {
                    label.setText("Double Click detected");
                } else if (e.getClickCount() == 1) {
                    label.setText("Single Click detected");
                }
            }

            public void mousePressed(MouseEvent e) {
                label.setText("Mouse Down (Pressed)");
            }

            public void mouseReleased(MouseEvent e) {
                label.setText("Mouse Up (Released)");
            }

            public void mouseEntered(MouseEvent e) { }

            public void mouseExited(MouseEvent e) { }
        });

        // Add components
        frame.add(label);
        frame.add(button);

        // Frame settings
        frame.setSize(450, 350);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        new MouseEventExample();
    }
}
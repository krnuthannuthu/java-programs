package Lab06;
/*6d. Develop a Swing program in Java to create a Tabbed Pan of Cyan, Magenta and
Yellow and
display the concerned color whenever the specific tab is selected in the Pan*/
import javax.swing.*;
import java.awt.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class ColorTabbedPane extends JFrame {

    private JPanel colorPanel;
    private JTabbedPane tabbedPane;

    public ColorTabbedPane() {

        setTitle("Tabbed Pane Color Example");

        // Main color display panel
        colorPanel = new JPanel();
        colorPanel.setPreferredSize(new Dimension(300, 200));

        // Tabbed pane
        tabbedPane = new JTabbedPane();

        // Tabs
        tabbedPane.addTab("Cyan", new JPanel());
        tabbedPane.addTab("Magenta", new JPanel());
        tabbedPane.addTab("Yellow", new JPanel());

        // Default color
        colorPanel.setBackground(Color.CYAN);

        // Change color when tab is selected
        tabbedPane.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                int index = tabbedPane.getSelectedIndex();

                switch (index) {
                    case 0:
                        colorPanel.setBackground(Color.CYAN);
                        break;
                    case 1:
                        colorPanel.setBackground(Color.MAGENTA);
                        break;
                    case 2:
                        colorPanel.setBackground(Color.YELLOW);
                        break;
                }
            }
        });

        add(tabbedPane, BorderLayout.NORTH);
        add(colorPanel, BorderLayout.CENTER);

        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ColorTabbedPane();
    }
}
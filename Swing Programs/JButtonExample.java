import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JButtonExample extends JFrame implements ActionListener {
    JButton b1, b2;
    JLabel l;

    JButtonExample() {
        // Create buttons
        b1 = new JButton("Click Me");
        b2 = new JButton("Exit");

        // Create label
        l = new JLabel("Press a button");

        // Add ActionListener
        b1.addActionListener(this);
        b2.addActionListener(this);

        // Layout
        setLayout(new FlowLayout());
        add(b1);
        add(b2);
        add(l);

        // Frame settings
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            l.setText("You clicked the button!");
        } else if (e.getSource() == b2) {
            System.exit(0); // Exit program
        }
    }

    public static void main(String[] args) {
        new JButtonExample();
    }
}

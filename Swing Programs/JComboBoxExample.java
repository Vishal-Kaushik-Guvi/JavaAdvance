import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JComboBoxExample extends JFrame implements ActionListener {
    JComboBox<String> combo;
    JLabel l;

    JComboBoxExample() {
        // Items in combo box
        String fruits[] = {"Apple", "Banana", "Mango", "Orange", "Grapes"};

        combo = new JComboBox<>(fruits);
        combo.setSelectedIndex(0); // default selection

        l = new JLabel("Select a fruit");

        // Add ActionListener
        combo.addActionListener(this);

        setLayout(new FlowLayout());
        add(combo);
        add(l);

        // Frame settings
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String selected = (String) combo.getSelectedItem();
        l.setText("You selected: " + selected);
    }

    public static void main(String[] args) {
        new JComboBoxExample();
    }
}

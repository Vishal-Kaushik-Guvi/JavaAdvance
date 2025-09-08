package AWT;

import java.awt.*;
import java.awt.event.*;

public class ListExample extends Frame implements ActionListener {
    List list;
    Label l;
    Button b;

    ListExample() {
        l = new Label("List Example, Select a language and click button:");
        list = new List();  // default: single selection
        b = new Button("Show Selection");

        // add items
        list.add("C");
        list.add("C++");
        list.add("Java");
        list.add("Python");
        list.add("Go");

        // button listener
        b.addActionListener(this);

        add(list);
        add(b);
        add(l);

        setLayout(new FlowLayout());
        setSize(400, 300);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        l.setText("Selected: " + list.getSelectedItem());
    }

    public static void main(String[] args) {
        new ListExample();
    }
}

package AWT;

import java.awt.*;
import java.awt.event.*;

public class CheckboxExample extends Frame implements ItemListener {
    Label l;
    Checkbox c1, c2;

    CheckboxExample() {
        l = new Label("Select something...");
        
        c1 = new Checkbox("C Programming");
        c2 = new Checkbox("Java Programming");

        c1.addItemListener(this);
        c2.addItemListener(this);

        add(c1);
        add(c2);
        add(l);

        setLayout(new FlowLayout());
        setSize(400, 300);
        setVisible(true);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        String msg = "";
        if (c1.getState()) msg += "C ";
        if (c2.getState()) msg += "Java ";
        l.setText("Selected: " + msg);
    }

    public static void main(String[] args) {
        new CheckboxExample();
    }
}


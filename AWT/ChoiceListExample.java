package AWT;

import java.awt.Choice;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ChoiceListExample extends Frame implements ItemListener{
    Choice c;
    Label l;
    ChoiceListExample(){
        l = new Label("Select a programming language:");
        c = new Choice();

        // add items
        c.add("C");
        c.add("C++");
        c.add("Java");
        c.add("Python");
        c.add("Go");

        // register listener
        c.addItemListener(this);

        add(c);
        add(l);

        setLayout(new FlowLayout());
        setSize(400, 300);
        setVisible(true);
    }
    @Override
    public void itemStateChanged(ItemEvent e) {
        l.setText("Selected: " + c.getSelectedItem());
    }

    public static void main(String[] args) {
        new ChoiceListExample();
    }
}

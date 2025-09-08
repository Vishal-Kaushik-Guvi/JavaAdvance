package AWT;

import java.awt.*;
import java.awt.event.*;

public class TextAreaExample extends Frame implements ActionListener {
    TextArea ta;
    Button b;
    Label l;

    TextAreaExample() {
        setLayout(new FlowLayout());

        l = new Label("Write something below:");
        ta = new TextArea(5, 30); // 5 rows, 30 columns
        b = new Button("Show Text");

        b.addActionListener(this);

        add(l);
        add(ta);
        add(b);

        setSize(500, 300);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String text = ta.getText();
        l.setText("You wrote: " + text);
    }

    public static void main(String[] args) {
        new TextAreaExample();
    }
}

import java.awt.*;
import java.awt.event.*;

public class TextFieldExample extends Frame implements ActionListener {
    TextField tf;
    Label l;
    Button b;

    TextFieldExample() {
        setLayout(new FlowLayout());

        l = new Label("Enter a fruit name:");
        tf = new TextField(20); // 20 columns wide
        b = new Button("Submit");

        b.addActionListener(this);
        tf.addActionListener(this); // pressing Enter also works

        add(l);
        add(tf);
        add(b);

        setSize(400, 200);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String text = tf.getText();
        l.setText("You entered: " + text);
    }

    public static void main(String[] args) {
        new TextFieldExample();
    }
}

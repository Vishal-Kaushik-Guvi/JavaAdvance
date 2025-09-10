import java.awt.*;
import java.awt.event.*;

public class KeyEvents extends Frame implements KeyListener {
    Label l;
    TextField tf;

    KeyEvents() {
        l = new Label();
        l.setBounds(20, 80, 300, 20);

        tf = new TextField();
        tf.setBounds(20, 50, 200, 20);

        // 👇 Registering this object as listener
        tf.addKeyListener(this);

        add(tf);
        add(l);

        setSize(400, 200);
        setLayout(null);
        setVisible(true);
    }

    // KeyListener methods (logic directly here)
    public void keyPressed(KeyEvent e) {
        l.setText("Key Pressed: " + e.getKeyChar() + " (Code: " + e.getKeyCode() + ")");
    }

    public void keyReleased(KeyEvent e) {
        l.setText("Key Released: " + e.getKeyChar());
    }

    public void keyTyped(KeyEvent e) {
        System.out.println("Key Typed: " + e.getKeyChar());
    }

    public static void main(String[] args) {
        new KeyEvents();
    }
}

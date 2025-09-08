package AWT;

import java.awt.*;
import java.awt.event.*;

public class MouseEvents extends Frame implements MouseListener,
 MouseMotionListener {

    String msg = "";
    int mouseX = 0, mouseY = 0;
    Label label;   // label to show messages

    public MouseEvents() {
        setLayout(new BorderLayout());

        // Create a label and add it to the bottom of the frame
        label = new Label();
        add(label, BorderLayout.SOUTH);

        addMouseListener(this);
        addMouseMotionListener(this);

        setSize(400, 300);
        setVisible(true);
    }

    public void mouseClicked(MouseEvent me) {
        msg = "Mouse clicked.";
        label.setText(msg);
        repaint();
    }

    public void mouseEntered(MouseEvent me) {
        msg = "Mouse entered.";
        label.setText(msg);
        repaint();
    }

    public void mouseExited(MouseEvent me) {
        msg = "Mouse exited.";
        label.setText(msg);
        repaint();
    }

    public void mousePressed(MouseEvent me) {
        mouseX = me.getX();
        mouseY = me.getY();
        msg = "Down";
        label.setText(msg + " at (" + mouseX + ", " + mouseY + ")");
        repaint();
    }

    public void mouseReleased(MouseEvent me) {
        mouseX = me.getX();
        mouseY = me.getY();
        msg = "Up";
        label.setText(msg + " at (" + mouseX + ", " + mouseY + ")");
        repaint();
    }

    public void mouseDragged(MouseEvent me) {
        mouseX = me.getX();
        mouseY = me.getY();
        msg = "Dragging";
        label.setText(msg + " at (" + mouseX + ", " + mouseY + ")");
        repaint();
    }

    public void mouseMoved(MouseEvent me) {
        setTitle("Moving mouse at " + me.getX() + ", " + me.getY());
    }

    public void paint(Graphics g) {
        g.drawString(msg, mouseX, mouseY);  // still show text at mouse point
    }

    public static void main(String[] args) {
        new MouseEvents();
    }
}

package AWT;

import java.awt.*;
import java.awt.event.*;

class MyMouseAdapter extends MouseAdapter {
    Label l;

    MyMouseAdapter(Label l) {
        this.l = l;  // take reference of label from Frame
    }

    @Override
    public void mouseClicked(MouseEvent me) {
        l.setText("Normal Adapter Class Used");
    }
}

public class AdapterExample extends Frame {
    Label l = new Label("Click anywhere inside the frame");

    AdapterExample() {
        add(l);  // add label to frame
        setLayout(new FlowLayout());

        // pass label reference to adapter class
        addMouseListener(new MyMouseAdapter(l));

        setSize(400, 300);
        setVisible(true);
    }

    public static void main(String[] args) {
        new AdapterExample();
    }
}

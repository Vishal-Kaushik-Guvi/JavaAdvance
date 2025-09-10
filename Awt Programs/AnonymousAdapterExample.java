import java.awt.*;
import java.awt.event.*;

public class AnonymousAdapterExample extends Frame {
    Label l = new Label("Click anywhere inside the frame");

    AnonymousAdapterExample() {
        // attach anonymous MouseAdapter
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent me) {
                l.setText("Anonymous Adapter Class Used");
            }
        });

        add(l); 
        setLayout(new FlowLayout());
        setBounds(40, 40, 500, 500);
        setVisible(true);
    }

    public static void main(String[] args) {
        new AnonymousAdapterExample();
    }
}

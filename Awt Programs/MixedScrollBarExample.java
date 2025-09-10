import java.awt.*;
import java.awt.event.*;

public class MixedScrollBarExample extends Frame implements AdjustmentListener {
    Scrollbar vScroll, hScroll;
    Label l;

    MixedScrollBarExample() {
        setLayout(new BorderLayout());

        // ✅ Vertical ScrollBar (0–100)
        vScroll = new Scrollbar(Scrollbar.VERTICAL, 50, 1, 0, 100);
        vScroll.addAdjustmentListener(this);

        // ✅ Horizontal ScrollBar (0–100)
        hScroll = new Scrollbar(Scrollbar.HORIZONTAL, 50, 1, 0, 100);
        hScroll.addAdjustmentListener(this);

        // ✅ Label in center
        l = new Label("Vertical: 50 | Horizontal: 50", Label.CENTER);

        // add components
        add(vScroll, BorderLayout.EAST);   // vertical on right
        add(hScroll, BorderLayout.SOUTH);  // horizontal at bottom
        add(l, BorderLayout.CENTER);

        setSize(400, 300);
        setVisible(true);
    }

    @Override
    public void adjustmentValueChanged(AdjustmentEvent e) {
        int v = vScroll.getValue();
        int h = hScroll.getValue();
        l.setText("Vertical: " + v + " | Horizontal: " + h);
    }

    public static void main(String[] args) {
        new MixedScrollBarExample();
    }
}

package SWINGS;

import java.awt.*;
import javax.swing.*;

/* 
<applet code="SimpleJApplet.class" width=300 height=200>
</applet>
*/

public class SimpleJApplet extends JApplet {
    JLabel l;

    // Called when applet is initialized
    public void init() {
        l = new JLabel("Hello, I am a JApplet!", JLabel.CENTER);
        add(l, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        
    }
}


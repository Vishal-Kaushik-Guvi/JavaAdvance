package SWINGS;

import javax.swing.*;

public class SimpleJFrame {
    public static void main(String[] args) {
        // Create a frame
        JFrame frame = new JFrame("My First JFrame");

        // Set size (width, height)
        frame.setSize(400, 300);

        // Close program when window is closed
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Make frame visible
        frame.setVisible(true);
    }
}

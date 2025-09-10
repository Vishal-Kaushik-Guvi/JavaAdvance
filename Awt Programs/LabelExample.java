import java.awt.*;

public class LabelExample extends Frame{
    
    Label label;

    LabelExample(){
        setLayout(new BorderLayout());
        label = new Label("Label is Shown Here"); // Low Priority

        add(label);

        label.setText("This is a Label Example"); // High Priority

        setSize(400, 300);
        setVisible(true);

    }

    public static void main(String[] args) {
        new LabelExample();
    }
}

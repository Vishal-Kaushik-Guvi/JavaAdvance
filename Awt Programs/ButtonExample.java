import java.awt.*;

public class ButtonExample extends Frame{
    Button btn;
    Label l = new Label();

    ButtonExample(){
        btn = new Button("Click Me");

        l.setText("Button Example");

        setLayout(new FlowLayout());

        add(btn);
        add(l);
        
        setBounds(20,20,300,200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ButtonExample();
    }


}

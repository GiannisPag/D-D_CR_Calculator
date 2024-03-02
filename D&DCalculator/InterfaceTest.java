import javax.swing.*;
import java.awt.*;

public class InterfaceTest extends JFrame{

    final int WINDOW_WIDTH = 420;
    final int WINDOW_HEIGHT = 420;

    public InterfaceTest() {
        setTitle("D&D CR Calculator");
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        JPanel panel = new JPanel();

        JTextField testText = new JTextField(20);
        panel.add(testText);

        JButton button1 = new JButton("Submit");
        panel.add(button1);
    }

}

import javax.swing.*;
import java.awt.*;

public class MyPanel extends JPanel {
    private int x = 0;
    private int y = 0;
    private int width = 100;
    private int height = 100;

    private String[] numbers = null;
    private int otstup = 1;

    public void  paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawLine(x,y,width,height);
    }

}

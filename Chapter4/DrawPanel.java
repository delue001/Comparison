package Chapter4;

import java.awt.Graphics;
import  javax.swing.JPanel;
public class DrawPanel extends JPanel {
    public void paintComponent (Graphics g) {
        super.paintComponent(g);
        for (int i = 0; i<=20; i++)
        {

            int width = getWidth();
            int height = getHeight();
            int lineNumber;

            g.drawLine(10, 20*i+20, width, height);
            g.drawLine(0, height, width, 0);
        }
    }
}

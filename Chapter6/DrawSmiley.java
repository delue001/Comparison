package Chapter6;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
public class DrawSmiley extends JPanel {
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        //draw face
        g.setColor(Color.BLACK);
        g.fillOval(10, 10, 200, 200);

        //draw eyes
        g.setColor(Color.RED);
        g.fillOval(55, 65, 30, 30);
        g.fillOval(135, 65, 30, 30);

        //draw mouth
        g.setColor(Color.GREEN);
        g.fillOval(50, 110, 120, 60);

        //mouth into smile
        g.setColor(Color.BLACK);
        g.fillRect(50, 110, 120, 30);
        g.fillOval(50, 120, 120, 40);
    }

}

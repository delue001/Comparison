package Chapter5;
import java.awt.Graphics;
import javax.swing.JPanel;
public class Circle extends JPanel {
    private int choice;

    public Circle (int userChoice){
        choice = userChoice;
    }
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        for (int i = 0; i<=10; i++)
        {
            switch (choice)
            {
                case 1:
                    g.drawOval(10+i*10, 10+i*10, 50+i*50, 30+i*20);
            }
        }
    }

}

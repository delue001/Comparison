package Chapter5;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ShapesTest {
    public static void main(String [] args) {
        String input = JOptionPane.showInputDialog(
                "Enter 1 to draw Rectangles \n" +
                "Enter 2 to draw Ovals");
        int choice = Integer.parseInt(input);

        Shapes panel = new Shapes(choice);
        JFrame application = new JFrame();
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.add(panel);
        application.setSize(500,500);
        application.setVisible(true);
    }
}

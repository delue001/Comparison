package Chapter5;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
public class CircleTest {
    public static void main(String [] args) {
        String input = JOptionPane.showInputDialog("Enter 1 to draw circle");
        int choice = Integer.parseInt(input);

        Circle panel = new Circle(choice);
        JFrame application = new JFrame();

        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.add(panel);
        application.setVisible(true);
        application.setSize(500,500);
    }
}

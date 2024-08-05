package Chapter4;

import Chapter4.DrawPanel;

import javax.swing.JFrame;

public class DrawPanelTest {
    public static void main(String [] args) {
        DrawPanel panel = new DrawPanel();

        JFrame application = new JFrame();

        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        application.add(panel);
        application.setSize(550, 550);
        application.setVisible(true);

    }
}

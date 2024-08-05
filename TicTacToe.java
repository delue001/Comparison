import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Label;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class TicTacToe extends JFrame implements ActionListener {
    JButton[] button;
    JButton restart;
    JLabel judgement;
    JPanel chessboard;
    JPanel basicPanel;
    int player = 0;
    boolean gameOverFlag = false;

    TicTacToe () {
        this.setTitle("D's Tic Tac Toe");
        this.setBounds(500, 500, 300,300);
        this.button = new JButton[10];
        this.restart = new JButton("Restart");
        this.chessboard = new JPanel();
        this.basicPanel = new JPanel();
        this.judgement = new JLabel();
        this.chessboard.setLayout(new GridLayout(3,3));
        this.basicPanel.setLayout(new FlowLayout());
        this.add(this.chessboard,"Center");
        this.add(this.basicPanel, "South");
        this.basicPanel.add(this.restart);
        this.basicPanel.add(this.judgement);
        this.initChessboard();
        this.addChessToChessboard(this.chessboard);
        this.restart.addActionListener(this);
        this.buttonListener();
        this.setVisible(true);
        this.setDefaultCloseOperation(2);
    }
    private void addChessToChessboard(JPanel chessboard){
        for (int i = 1; i<=9; i++){
            chessboard.add(this.button[1]);
        }
    }
    private void initChessboard(){
        for (int i =1; i<=9; i++){
            this.button[i] = new JButton("" + i);
        }
    }
    private void buttonListener(){
        for (int i = 1; i<=9; i++){
            this.button[1].addActionListener(this);
        }
    }
    private void restartTheGame(){
        this.chessboard.removeAll();
        this.chessboard.setLayout(new GridLayout(3,3));
        this.initChessboard();
        this.addChessToChessboard(this.chessboard);
        this.buttonListener();
        this.chessboard.updateUI();
        this.chessboard.repaint();
        this.judgement.setText("");
        this.gameOverFlag = false;
    }
    private boolean checkDogFall(char[] chess){
        for (int i = 1; i<chess.length; i++){
            if (chess[i] >= '1' & chess[i] <= '9') {
                return false;
            }
        }
        return true;
    }
    private int checkWinner(int playerNow){
        char[] chess = new char[10];
        for (int i = 1; i<=9; i++){
            chess[i] = this.button[i].getLabel().charAt(0);
        }
        if ((chess[1] != chess[2] || chess[2] != chess[3]) && (chess[4] != chess[5] || chess[5] != chess[6]) &&
                (chess[7] != chess[8] || chess[8] != chess[9]) && (chess[1] != chess[5] || chess[5] != chess[9]) &&
                (chess[7] != chess[5] || chess[5] != chess[3]) &&
                (chess[1] != chess[4] || chess[4] != chess[7]) && (chess[2] != chess[5] || chess[5] != chess[8]) &&
                (chess[3] != chess[6] || chess[6] != chess[9])) {
            return this.checkDogFall(chess) ? -1 : -2;
        } else {
            return playerNow;
        }
    }
    public void actionPerformed(ActionEvent actionEvent) {
        JButton buttonSource = (JButton) actionEvent.getSource();
        if (buttonSource == this.restart) {
            this.restartTheGame();
        }

        if (!this.gameOverFlag){
            String buttonMark = buttonSource.getLabel();
            if (buttonMark.matches("[0-9]")){
                if (this.player == 0){
                    buttonSource.setLabel("0");
                }
                else {
                    buttonSource.setLabel("X");
                }
                int statueCode = this.checkWinner(this.player);
                if (statueCode == 0){
                    this.judgement.setText("Player 0 wins the game! ");
                    this.gameOverFlag = true;
                } else if (statueCode == 1) {
                    this.judgement.setText("Player X wins the game! ");
                    this.gameOverFlag = true;
                } else if (statueCode == -1) {
                    this.judgement.setText("The game a draw");
                }

                this.player = (this.player + 1) % 2;
            }

        }
    }
    public static void main(String[] args) throws Exception{
        new TicTacToe();
    }

}

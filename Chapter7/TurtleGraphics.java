package Chapter7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TurtleGraphics {
    private static final int FLOOR_SIZE = 20;
    private static final char PEN_DOWN = '1';


    char[][] floor = new char[FLOOR_SIZE][FLOOR_SIZE];
    private int turtleA = 0;
    private  int turtleB = 0;
    private boolean penDown = false;

    public static void main(String[] args) {
        TurtleGraphics turtle = new TurtleGraphics();
        turtle.run();
    }
    public void run(){
        Scanner scanner = new Scanner(System.in);
        TurtleGraphics turtle = new TurtleGraphics();
        try {
            while (true){

                System.out.println("Enter Command: ");
                if (scanner.hasNext()){
                    String command = scanner.next();
                    turtle.commandProcess(command);
                }else {
                    break;
                }
            }
        }catch (InputMismatchException e){
            System.out.println("Invalid input. Please try again");
            scanner.nextInt();

        }
    }
    public void commandProcess(String command) {
        switch (command.charAt(0)) {
            case '1':
                penDown = true;
                break;
            case '2':
                penDown = false;
                break;
            case '3':
                moveForward(Integer.parseInt(command.substring(1)));
                break;
            case '4':
                turnRight();
                break;
            case '5':
                turnLeft();
                break;
            case '6':
                displayFloor();
                break;
            default:
                System.out.println("Invalid command");
        }
    }
    public void moveForward(int step){
        for (int i = 0; i < step; i++){
            if (penDown){
                floor[turtleA][turtleB] = PEN_DOWN;
            }
            turtleA += 1;
            turtleB += 1;
            if (turtleA >= FLOOR_SIZE){
                turtleA = 0;
            }
            if (turtleB >= FLOOR_SIZE){
                turtleB = 0;
            }
        }
    }
    public void turnLeft(){

    }
    public void turnRight(){

    }
    public void displayFloor(){
        for (int i = 0; i<FLOOR_SIZE; i++){
            for (int k = 0; k<FLOOR_SIZE; k++){
                System.out.print(floor[i][k] == PEN_DOWN ? '*' : ' ');
            }
            System.out.println();
        }
    }


}
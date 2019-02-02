import java.util.Scanner;
public class TicTacToeTester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        board test = new board();
        int gameMode;
        System.out.println("Welcome to 4x4 Tic Tac Toe.");
        System.out.println("Type 1 for singleplayer and 2 for a two player game.");
        while(true) {
            gameMode = sc.nextInt();
            if (gameMode == 1) {
                game test1 = new game(gameMode);
                break;
            }
            else if (gameMode == 2) {
                game test2 = new game(gameMode);
                test2.twoPlayer();
                break;
            }
        }
    }
}
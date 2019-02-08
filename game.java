import java.util.Scanner;
public class game {
    private int gameMode;
    private board table;
    private player player1;
    private player player2;
    public game(int mode) {
        Scanner sc = new Scanner(System.in);
        table = new board();
        if (mode == 1) {
            System.out.println("Enter your name.");
            String name = sc.nextLine();
            player1 = new player("X",name);
        }
        if (mode == 2) {
            System.out.println("Player 1, enter your name.");
            String name = sc.nextLine();
            player1 = new player("X",name);
            System.out.println("Player 2, enter your name.");
            String name2 = sc.nextLine();
            player2 = new player("O",name2);
        }
    }
    public void singlePlayer() {
        int turn = 0;
        do {
            System.out.print('\u000C'); //clears window
            table.printBoard();
            player1.move(table);
            turn++;
        } while (!table.gameOver(player1.getMarker()) && turn < 16); //checks if game is over + whether turn matches max # of cells in board
        System.out.print('\u000C');
        table.printBoard(); //prints final board
        if (table.gameOver(player1.getMarker())) System.out.println(player1.getName() + " wins!");
        else System.out.println("You didn't win.");
    }
    public void twoPlayer() {
        int playerTurn = (int)(Math.random()*2 + 1); //randomizes who starts
        int turn = 0;
        do {
            System.out.print('\u000C'); //window clear
            table.printBoard();
            if (playerTurn == 1) player1.move(table);
            else player2.move(table);
            playerTurn++;
            turn++;
            if (playerTurn == 3) playerTurn = 1;
        } while (!table.gameOver(player1.getMarker()) 
              && !table.gameOver(player2.getMarker()) && turn < 16); //gameover check + whether turn matches max cells
        System.out.print('\u000C');
        table.printBoard();
        if (table.gameOver(player1.getMarker())) System.out.println(player1.getName() + " wins!");
        else if (table.gameOver(player2.getMarker())) System.out.println(player2.getName() + " wins!");
        else System.out.println("The game is a tie!");
    }
}
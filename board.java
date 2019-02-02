import java.util.Scanner;
public class board {
    private String[][] board;
    public board() {
        board = new String[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                board[i][j] = "_";
            }
        }
    }
    public String[][] getBoard() {return board;}
    public void printBoard() {
        System.out.println("  1 2 3 4");
        for (int i = 0; i < 4; i++) {
            System.out.print((i+1) + " ");
            for (int j = 0; j < 4; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
    public void move(String marker, int row, int col) {
        board[row][col] = marker;
    }
    public boolean gameOver(player player1) {
        for (int i = 0; i < 4; i++) {
            if (board[i][0].equals(board[i][1]) 
             && board[i][1].equals(board[i][2]) 
             && board[i][2].equals(board[i][3]) 
             && board[i][3].equals(player1.getMarker())) return true;
            if (board[0][i].equals(board[1][i]) 
             && board[1][i].equals(board[2][i])
             && board[2][i].equals(board[3][i]) 
             && board[3][i].equals(player1.getMarker())) return true;
        }
        if (board[0][0].equals(board[1][1]) 
         && board[1][1].equals(board[2][2])
         && board[2][2].equals(board[3][3])
         && board[3][3].equals(player1.getMarker())) return true;
        if (board[0][3].equals(board[1][2]) 
         && board[1][2].equals(board[2][1])
         && board[2][1].equals(board[3][0])
         && board[3][0].equals(player1.getMarker())) return true;
        return false;
    }
}
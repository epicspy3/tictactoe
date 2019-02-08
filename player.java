import java.util.Scanner;
public class player{
    private String marker;
    private String name;
    private int playerMoveX;
    private int playerMoveY;
    public player(String mark, String username) {
        marker = mark;
        name = username;
    }
    public String getName() {return name;}
    public String getMarker() {return marker;}
    public void move(board game) {
        do {
        Scanner sc = new Scanner(System.in);
        System.out.println(name + ": Type the X coordinate of the point you want to place your marker on.");
        playerMoveX = sc.nextInt();
        System.out.println(name + ": Type the Y coordinate of the point you want to place your marker on.");
        playerMoveY = sc.nextInt();
    } while(game.cellIsOccupied(playerMoveX-1,playerMoveY-1)); //check if the cell the player inputted is occupied
        game.move(marker,playerMoveX-1,playerMoveY-1);
    }
}
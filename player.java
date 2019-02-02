import java.util.Scanner;
public class player{
    private String marker;
    private String name;
    public player(String mark, String username) {
        marker = mark;
        name = username;
    }
    public String getName() {return name;}
    public String getMarker() {return marker;}
    public void move(board game) {
        Scanner sc = new Scanner(System.in);
        System.out.println(name + ": Type the X coordinate of the point you want to place your marker on.");
        int playerMoveX = sc.nextInt();
        System.out.println(name + ": Type the Y coordinate of the point you want to place your marker on.");
        int playerMoveY = sc.nextInt();
        game.move(marker,playerMoveX-1,playerMoveY-1);
    }
}
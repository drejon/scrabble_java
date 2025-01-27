import java.util.Scanner;

public class Game {
    Board board;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of columns: ");
        int columns = scanner.nextInt();

        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        
        Game game = new Game();
        game.board = new Board(columns, rows);

        game.board.display();
    }

    public int getBoardTiles() {
        return this.board.getTilesNumber();
    }
}

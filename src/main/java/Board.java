import java.util.stream.IntStream;

public class Board {
    private int columns;
    private int rows;
    private Tile[] tiles;

    public Board(int columns, int rows) {
        this.columns = columns;
        this.rows = rows;

        tiles = new Tile[rows * columns];

        for (int index = 0; index < tiles.length; index++) {
            int row = index / columns;
            int col = index % columns;
            tiles[index] = new Tile('_', new Position(col, row));
        }
    }

    public void display() {

        System.out.println("Scrable Board:");
        
        for(int row = 0; row < this.rows; row++) {
            for(int column = 0; column < this.columns; column++) {
                System.out.print(tiles[column]);
            }

            System.out.println(tiles[row]);
        }
    }
    
    public int getTilesNumber() {
        return this.columns * this.rows;
    }
}

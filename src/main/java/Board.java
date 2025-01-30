import java.util.stream.IntStream;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;

public class Board {
    private int columns;
    private int rows;
    private Tile[] tiles;

    public Board(int columns, int rows) {
        this.columns = columns;
        this.rows = rows;

        this.tiles = new Tile[columns * rows];
        
        for (int index = 0; index < this.tiles.length; index++) {
            int row = index / columns;
            int col = index % columns;
            
            this.tiles[index] = new Tile(" _ ", new Position(col, row));
        }
    }

    private boolean matchPosition(Position a, Position b) {
        return a.x == b.x && a.y == b.y;
    }
    
    private Tile search(int x, int y) {
        
        for(Tile tile: this.tiles) {
            boolean match = this.matchPosition(tile.position, new Position(x, y));
            
            if (match) { return tile; }
        }
        
        return new Tile("NOT FOUND", new Position(0, 0));
    }

    public void setTile(int x, int y, char multiplier, String character) {
        Tile foundTile = this.search(x, y);
        
        foundTile.setMultiplier(multiplier);
        foundTile.setCharacter(character);
    }

    public Position indexToPosition(int index) {
        int x = index % this.columns;
        int y = index / this.columns;

        return new Position(x, y);
    }

    public Position getMiddlePosition() {
        int middleX = this.columns / 2;
        int middleY = this.rows / 2;

        int middle = middleX + middleY * this.columns;

        Position middlePosition = this.indexToPosition(middle);

        // System.out.println("Middle position: " + middleX + " " + middleY);
        // System.out.println("Middle index: " + middle);
        return middlePosition;
    }

    public int getColumsNumber() {
        return this.columns;
    }

    public int getRowsNumber() {
        return this.rows;
    }

    public int getTilesNumber() {
        return this.columns * this.rows;
    }

    public Tile[] getTiles() {
        return this.tiles;
    }

    public void display() {
        System.out.println("Scrabble Board:");

        for (int row = 0; row < this.rows; row++) {
            for (int column = 0; column < this.columns; column++) {
                int index = row * this.columns + column;
                System.out.print(this.tiles[index]);
            }
            System.out.println();
        }
    }
}

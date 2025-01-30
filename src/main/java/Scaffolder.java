import java.util.ArrayList;
import java.util.List;

public class Scaffolder {
    Board board;
    Tile[] tiles;

    public Scaffolder(Board board) {
        this.board = board;
        this.tiles = this.board.getTiles();
        this.populateCross();
    }

    public void populateCross() {
        Position middle = this.board.getMiddlePosition();
        
        this.board.setTile(middle.x, middle.y, 'p', " p ");

        List<Position> offsetPositions = this.crossPositions();

        for(Position offset: offsetPositions) {
            this.board.setTile(middle.x + offset.x, middle.y + offset.y, 'p', " p ");
        }
    }

    private List<Position> crossPositions() {
        int[] xPattern = {-1, 1, 1, -1};
        int[] yPattern = {1, 1, -1, -1};

        List<Position> offsets = new ArrayList<>();

        int columns = this.board.getColumsNumber();
        int rows = this.board.getRowsNumber();
        int maxXOffset = columns / 2;
        int maxYOffset = rows / 2;

        for (int offset = 1; offset <= Math.min(maxXOffset, maxYOffset); offset++) {
            for (int index = 0; index < xPattern.length; index++) {
                int x = xPattern[index] * offset;
                int y = yPattern[index] * offset;
                
                offsets.add(new Position(x, y));
            }
        }

        return offsets;
    }
}

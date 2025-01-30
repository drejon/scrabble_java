import java.util.ArrayList;
import java.util.List;

public class Scaffolder {
    private Board board;
    private Tile[] tiles;

    public Scaffolder(Board board) {
        this.board = board;
        this.tiles = this.board.getTiles();
        this.populateCross();
        this.populateCorners();
        this.setDoubleChar();
    }

    private void populateCross() {
        Position middle = this.board.getMiddlePosition();
        List<Position> offsetPositions = this.crossPositions();
        
        this.board.setTile(middle.x, middle.y, 'p', " p ");

        for(Position offset: offsetPositions) {
            this.board.setTile(middle.x + offset.x, middle.y + offset.y, 'p', " p ");
        }
    }

    private void setDoubleChar() {
        List<Tile> filteredTiles = this.filter();

        Position randomPosition = this.randomPosition(filteredTiles);
        // System.out.println("Random: " + randomPosition.x + " " + randomPosition.y);

        // for(Tile tile: filteredTiles) {
        //     System.out.println("Tile position: " + tile.position.x + " " + tile.position.y);
        // }
        
        this.board.setTile(randomPosition.x, randomPosition.y, 'l', " l ");
    }

    private List<Tile> filter() {
        List<Tile> emptyTiles = new ArrayList<Tile>();

        for(Tile tile: this.tiles) {
            char tileMultiplier = tile.getMultiplier();
            if (tileMultiplier == ' ') { emptyTiles.add(tile); }
        }

        System.out.println(emptyTiles.size());
        return emptyTiles;
    }

    private Position randomPosition(List<Tile> tiles) {
        int size = tiles.size();
        
        int randomIndex = (int) (Math.random() * size);

        // System.out.println(Math.random() * size);
        return this.board.indexToPosition(randomIndex);
    }

    private void populateCorners() {
        int cols = this.board.getColumsNumber();
        int rows = this.board.getRowsNumber();

        int middleX = cols / 2;
        int middleY = rows / 2;
        
        Position[] positions = {
            new Position(0, 0),
            new Position(middleX, 0),
            new Position(cols - 1, 0),
            new Position(0, middleY),
            new Position(cols - 1, middleY),
            new Position(0, rows - 1),
            new Position(middleX, rows - 1),
            new Position(cols - 1, rows - 1)
        };

        for (Position position: positions) {
            this.board.setTile(position.x, position.y, 'P', " P ");
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

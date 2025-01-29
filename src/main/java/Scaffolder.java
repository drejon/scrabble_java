public class Scaffolder {
    Board board;
    Tile[] tiles;

    public Scaffolder(Board board) {
        this.board = board;
        this.tiles = this.board.getTiles();
        this.populateCross();
    }

    private int getMiddle() {
        Tile[] boardTiles = this.tiles;
        int middle = boardTiles.length / 2;

        return middle;
    }

    public void populateCross() {
        int middle = this.getMiddle();
        
    }
}
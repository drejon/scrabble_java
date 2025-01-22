public class Board {
    private int columns;
    private int rows;

    public Board(int columns, int rows) {
        this.columns = columns;
        this.rows = rows;
    }

    public int getTilesNumber() {
        return this.columns * this.rows;
    }
}

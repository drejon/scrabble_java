public class Board {
    private int columns;
    private int rows;
    
    public Board(int columns, int rows) {
        this.columns = columns;
        this.rows = rows;
    }

    public static void main(String[] args) {
        // int size = this.columns * this.rows;
    }

    public void display() {

        System.out.println("Scrable Board:");
        
        for(int row = 0; row < this.rows; row++) {
            for(int column = 0; column < this.columns; column++) {
                System.out.print("|_");
            }

            System.out.println("|");
        }
    }
    
    public int getTilesNumber() {
        return this.columns * this.rows;
    }

}

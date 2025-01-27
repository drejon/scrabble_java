import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BoardTest {

    @Test
    void checksTilesNumber() {
        Board board = new Board(3, 3);

        int result = board.getTilesNumber();

        assertEquals(9, result);
    }
}

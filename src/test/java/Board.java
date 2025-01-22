import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BoardTest {

    @Test
    void boardHasPromptedDimmensions() {
        Board board = new Board();
        
        int result = board.tilesNumber;
        
        assertEquals(5, result);
    }
}


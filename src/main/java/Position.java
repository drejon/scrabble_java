import java.util.HashMap;

public class Position {
    public int x;
    public int y;

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public HashMap<String, Integer> getPosition() {
        HashMap<String, Integer> position = new HashMap<>();

        position.put("x", this.x);
        position.put("y", this.y);
        
        return position;
    }

    public String toString() {
        // return
        // return this.getPosition().get('x');
        return "(" + this.x + ", " + this.y + ")";
    }
}

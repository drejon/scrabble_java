public class Tile {
    
    String multiplier;
    String character;
    Position position;

    public Tile(String character, Position position) {
        this.position = position;
        this.character = character;
    }

    public void setMultiplier(String newMultiplier) {
        this.multiplier = newMultiplier;
    }

    public void setCharacter(String newChar) {
        this.character = newChar;
    }

    public String getCharacter() { 
        return this.character;
     }

    public String getMultiplier() { 
        return this.multiplier;
     }

    public Position getPosition() {
        return this.position; 
    }

    public String toString() {
        return " ".equals(character) ? " _ " : (character == null ? " " : character);
    }
}

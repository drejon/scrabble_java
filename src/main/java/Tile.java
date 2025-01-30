public class Tile {
    
    char multiplier;
    String character;
    Position position;

    public Tile(String character, Position position) {
        this.position = position;
        this.character = character;
    }

    public void setMultiplier(char newMultiplier) {
        this.multiplier = newMultiplier;
    }

    public void setCharacter(String newChar) {
        this.character = newChar;
    }

    public String getCharacter() { 
        return this.character;
     }

    public char getMultiplier() { 
        return this.multiplier;
     }

    public Position getPosition() {
        return this.position; 
    }

    public String toString() {
        return character.equals(" ") ? " _ " : String.valueOf(character);
    }
}

public class Tile {
    
    char multiplier;
    char character;
    Position position;

    public Tile(char character, Position position) {
        this.position = position;
        this.character = character;
    }

    public void setMultiplier(char newMultiplier) {
        this.multiplier = newMultiplier;
    }

    public void setCharacter(char newChar) {
        this.character = newChar;
    }

    public char getCharacter() { 
        return this.character;
     }

    public char getMultiplier() { 
        return this.multiplier;
     }

    public Position getPosition() { 
        return this.position; 
    }

    public String toString() {
        return character == ' ' ? "_" : String.valueOf(character);
    }
}
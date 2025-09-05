package TicTacToe;

public class Player {
    private final char marker;  // X oder O

    public Player(char marker) {
        this.marker = marker;
    }

    public char getMarker() {
        return marker;
    }

    @Override
    public String toString() {
        return "Player{" +
                "marker=" + marker +
                '}';
    }
}


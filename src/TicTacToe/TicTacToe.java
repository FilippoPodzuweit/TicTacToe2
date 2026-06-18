public class TicTacToe {

    private char currentPlayer;
    private Board board;

    public TicTacToe() {
        this.currentPlayer = 'X';
        this.board = new Board();
    }
}
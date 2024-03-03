package Boardgame;

public class Piece {

    protected Position position;
    private Board board;

    public Piece(Board board) {
        this.board = board;
        position = null;
    }

    protected  Board getBoard() {
        return board;
    } // esse get é protected por que apenas classes do mesmo pacote ou subclasses podem ter acesso a ele

  }

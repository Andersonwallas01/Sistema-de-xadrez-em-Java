package Boardgame;

public abstract class Piece {

    protected Position position;
    private Board board;

    public Piece(Board board) {
        this.board = board;
        position = null;
    }

    protected  Board getBoard() {
        return board;
    } // esse get é protected por que apenas classes do mesmo pacote ou subclasses podem ter acesso a ele

   public abstract boolean [][] possibleMoves();

    public boolean possibleMove(Position position){
        return possibleMoves()[position.getRow()][position.getColumn()];
    }

    public boolean isThereAnyPossibleMove(){
        boolean[][] mat = possibleMoves();
        for (int i =0; i<mat.length; i++){
            for (int j=0; j< mat.length; j++){
                return true;
            }
        }
        return false;
    }
}

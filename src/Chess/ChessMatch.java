package Chess;

import Boardgame.Board;

public class ChessMatch {

    private Board board;

    public ChessMatch(){
        board = new Board(8,8);
    }

    public ChessPiece[][] getPieces() {
        ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
        for (int i = 0; i < board.getRows(); i++) {
            for (int j = 0; j < board.getColumns(); j++) {
                mat[i][j] = (ChessPiece) board.piece(i, j);
            }
        } //esse metodo tem que retornar uma matriz de peças de xadrez correspondente a uma partida
            return mat;
    }
}

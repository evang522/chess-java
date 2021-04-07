package chess.Piece;

import chess.AbstractPiece;
import chess.BoardPosition;
import chess.MovePossibleResponse;
import chess.Side;
import chess.Vector;

public class Rook extends AbstractPiece {
    public Rook(BoardPosition position, Side side) {
        super(position, side);
    }

    @Override
    public MovePossibleResponse checkMovePossible(Vector move) {
        if (this.movePlacesPieceOffBoard(move)) {
            return MovePossibleResponse.forNotPossible("Moves Piece off the board.");
        }

        if (move.x() == 0 || move.y() == 0) {
            return MovePossibleResponse.forPossible();
        }
        
        return MovePossibleResponse.forNotPossible("Rook may not move diagonally");
    }
}

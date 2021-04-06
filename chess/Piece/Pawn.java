package chess.Piece;

import chess.AbstractPiece;
import chess.BoardPosition;
import chess.MovePossibleResponse;
import chess.Side;
import chess.Vector;

public class Pawn extends AbstractPiece {
    public Pawn(BoardPosition position, Side side) {
        super(position, side);
    }

    @Override
    public MovePossibleResponse checkMovePossible(Vector move) {
        if (this.movePlacesPieceOffBoard(move)) {
            return MovePossibleResponse.forNotPossible("Moves Piece off the board.");
        }

        if (this.side().equals(Side.WHITE)) {
            if (this.position().y() == 1 && move.y() == 2) {
                return MovePossibleResponse.forPossible();
            }


            if (move.y() == 1) {
                return MovePossibleResponse.forPossible();
            }

            return MovePossibleResponse.forNotPossible("Move attempts to move pawn further than it may go");
        } else {

            if (this.position().y() == 6 && move.y() == 2) {
                return MovePossibleResponse.forPossible();
            }

            if (move.y() == 1) {
                return MovePossibleResponse.forPossible();
            }

            return MovePossibleResponse.forNotPossible("Move attempts to move pawn further than it may go");
        }
    }

}

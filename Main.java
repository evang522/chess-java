import chess.AbstractPiece;
import chess.BoardPosition;
import chess.Side;
import chess.Vector;
import chess.Piece.Pawn;

public class Main {

    public static void main(String[] args) {
        AbstractPiece pawn = new Pawn(new BoardPosition(0, 1), Side.WHITE);

        System.out.println(pawn);

        pawn.moveBy(new Vector(0, 2));
        pawn.moveBy(new Vector(0, 1));

        System.out.println(pawn);
    }
}

import chess.BoardPosition;
import chess.Side;
import chess.Vector;
import chess.Piece.Rook;

public class Main {

    public static void main(String[] args) {
        Rook rook = new Rook(new BoardPosition(0, 0), Side.WHITE);

        System.out.println(rook);

        rook.moveBy(new Vector(0, 2));
        rook.moveBy(new Vector(2, 0));
    

        System.out.println(rook);
    }
}

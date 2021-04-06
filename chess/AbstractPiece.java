package chess;

public abstract class AbstractPiece {
    private BoardPosition boardPosition;
    private Side side;

    public AbstractPiece(BoardPosition position, Side side) {
        this.boardPosition = position;
        this.side = side;
    }

    public BoardPosition position() {
        return this.boardPosition;
    }

    public void moveBy(Vector vector) {
        MovePossibleResponse movePossible = this.checkMovePossible(vector);

        if (!movePossible.possible()) {
            throw new RuntimeException(movePossible.reasonNotPossible().get());
        }

        this.boardPosition.move(vector);
    }

    public abstract MovePossibleResponse checkMovePossible(Vector move);

    @Override
    public String toString() {
        return this.getClass().getName() + "[" + this.side.toString() + "](X:" + this.position().x() + "; Y:"
                + this.position().y() + ")";
    }

    public BoardPosition boardPosition() {
        return boardPosition;
    }

    public void setBoardPosition(BoardPosition boardPosition) {
        this.boardPosition = boardPosition;
    }

    public Side side() {
        return side;
    }

    public void setSide(Side side) {
        this.side = side;
    }

    public BoardPosition resultingPositionAfterMove(Point move) {
        Integer resultX = move.x() + this.position().x();
        Integer resultY = move.y() + this.position().y();

        return new BoardPosition(resultX, resultY);
    }

    public Boolean movePlacesPieceOffBoard(Vector move) {
        Integer resultX = move.x() + this.position().x();
        Integer resultY = move.y() + this.position().y();

        if (resultX > 8 || resultX < 0) {
            return true;
        }

        if (resultY > 8 || resultY < 0) {
            return true;
        }

        return false;
    }
}

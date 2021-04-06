package chess;

public class BoardPosition {
    private Point point;

    public BoardPosition(Integer x, Integer y) {
        if (!BoardPosition.positionIsValid(x, y)) {
            throw new RuntimeException("Position is not valid");
        }

        this.point = new Point(x, y);
    }

    public Integer x() {
        return this.point.x();
    }

    public Integer y() {
        return this.point.y();
    }

    public void move(Vector move) {
        Point newPosition = this.getResultingPositionFromMove(move);
        if (!BoardPosition.positionIsValid(newPosition.x(), newPosition.y())) {
            throw new RuntimeException("This move is invalid");
        }

        this.point = newPosition;
    }

    private Point getResultingPositionFromMove(Vector move) {
        Point resultingPoint = new Point(this.point.x(), this.point.y());
        resultingPoint.incrementXBy(move.x());
        resultingPoint.incrementYBy(move.y());

        return resultingPoint;
    }

    private static Boolean positionIsValid(Integer x, Integer y) {
        if (x < 0 || x > 7) {
            return false;
        }

        if (y < 0 || y > 7) {
            return false;
        }

        return true;
    }
}

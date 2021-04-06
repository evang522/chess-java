package chess;

public class Point {
    private Integer x;
    private Integer y;

    public Point(Integer x, Integer y) {
        this.x = x;
        this.y = y;
    }

    public Integer x() {
        return x;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    public void incrementXBy(Integer x) {
        this.x += x;
    }

    public void incrementYBy(Integer y) {
        this.y += y;
    }

    public Integer y() {
        return y;
    }

    public void setY(Integer y) {
        this.y = y;
    }
}

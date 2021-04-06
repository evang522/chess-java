package chess;

public class Vector {
    private Integer x;
    private Integer y;

    public Vector(Integer x, Integer y) {
        this.x = x;
        this.y = y;
    }

    public Integer x() {
        return x;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    public Integer y() {
        return y;
    }

    public void setY(Integer y) {
        this.y = y;
    }
}

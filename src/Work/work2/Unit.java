package Work.work2;

public class Unit {
    private int x;
    private int y;
    private final String name;

    public Unit(String name) {
        this.x = 0;
        this.y = 0;
        this.name = name;
    }

    public void move(int x_move, int y_move) {
        this.x = x_move;
        this.y = y_move;
    }

    public void stop() {

    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name + " (" + x + ", " + y + ")";
    }

    public String info() {
        return name + "의 위치" + " (" + x + ", " + y + ")";
    }
}

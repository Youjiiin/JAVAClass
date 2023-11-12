package Work.work2;

public class Tank extends Unit{
    private String mode = "default";

    public Tank(String name) {
        super(name);
    }

    public String getMode() {
        return mode;
    }

    public void changeMode() {
        this.mode = "AttackMode";
    }

    @Override
    public String info() {
        return getName() + "의 위치 : " + "(" + getX() + ", " + getY() + "), 모드 : " + getMode();
    }
}

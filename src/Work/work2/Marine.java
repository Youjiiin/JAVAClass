package Work.work2;

public class Marine extends Unit {
    private String mode = "default";

    public Marine(String name) {
        super(name);
    }

    public String getMode() {
        return mode;
    }

    public void stimPack() {
        this.mode = "StimPack";
    }

    @Override
    public String info() {
        return getName() + "의 위치 : " + "(" + getX() + ", " + getY() + "), 모드 : " + getMode();
    }
}

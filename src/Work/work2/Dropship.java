package Work.work2;

import java.util.ArrayList;
import java.util.List;

public class Dropship extends Unit {
    private final List<Object> list = new ArrayList<>();

    public Dropship(String name) {
        super(name);
    }

    public List<Object> getList() {
        return list;
    }

    public void load(Unit dropship, Unit loadUnit) {
        dropship.move(loadUnit.getX(),loadUnit.getY());
        list.add(loadUnit);
    }

    public void unload(Unit dropship, Unit unit) {
        list.remove(unit);
        unit.move(dropship.getX(), dropship.getY());
    }

    @Override
    public String info() {
        return getName() + "의 위치 : " + "(" + getX() + ", " + getY() + "), 수송 목록 : " + getList();
    }
}

package Week5;

public class Point30 extends Point{
    int z;

    Point30(int x, int y, int z){
        super(x, y);
        this.z = z;
    }

    String getLocation() {
//        return "x : " + x + "y : " + y + "z : " + z;
        return super.getLocation() + " z : " + z;
    }
}

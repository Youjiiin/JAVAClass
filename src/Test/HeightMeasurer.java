package quiz2;

public class HeightMeasurer implements Measurer {
    public double measure(Object obj){
        return ((Person)obj).getHeight();
    }
}

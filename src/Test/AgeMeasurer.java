package quiz2;

public class AgeMeasurer implements Measurer {
    public double measure(Object obj){
        return ((Person)obj).getAge();
    }
}

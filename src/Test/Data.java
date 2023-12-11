package quiz2;

public class Data {
    public static double average(Object[] obj, Measurer meas){
        double sum = 0;
        for (Object o : obj){
            sum += meas.measure(o);
        }
        if (obj.length > 0) {
            return sum / obj.length;
        }
        else{
            return 0;
        }
    }
}

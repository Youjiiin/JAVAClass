package quiz2;

public class SalaryMeasurer implements Measurer {
    public double measure(Object obj){
        return ((Employee)obj).getSalary();
    }
}

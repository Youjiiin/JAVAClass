package quiz2;

public class Temporary extends Employee {
    private int workingHours;
    private int hourlyPay = 10000;

    // Constructor
    public Temporary(String name, int age, int height, String department){
        super(name, age, height, department);
    }

    //getters and setters
    public int getWorkingHours() {
        return workingHours;
    }
    public void setWorkingHours(int workingHours) {
        this.workingHours = workingHours;
        this.setSalary(hourlyPay*workingHours);
    }
    public int getHourlyPay() {
        return hourlyPay;
    }
    public void setHourlyPay(int hourlyPay) {
        this.hourlyPay = hourlyPay;
    }

    // Override toString()
    public String toString() {
        return "Temporary{" +
                "name='" + super.getName() + '\'' +
                ", age=" + super.getAge() +
                ", height=" + super.getHeight() +
                ", department='" + super.getDepartment() + '\'' +
                ", salary=" + super.getSalary() +
                ", workingHours=" + workingHours +
                ", hourlyPay=" + hourlyPay +
                '}';
    }
}

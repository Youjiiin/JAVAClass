//package quiz2;
//
//public class Temporary extends Employee {
//    private int workingHours;
//    private int hourlyPay = 1000;
//
//    // 매개변수로 받는 생성자 구현
//    public Temporary(String name, int age, int height, String department) {
//        super(name, age, height, department);
//    }
//
//
//    public void setWorkingHours(int workingHours) {
//        this.workingHours = workingHours;
//        setSalary(workingHours * hourlyPay);
//    }
//
//    @Override
//    public String toString() {
//        return "Temporary = " +
//                "name : " + getName() +
//                ", age : " + getAge() +
//                ", height : " + getHeight() +
//                ", department : " + getDepartment() +
//                ", workingHours : " + workingHours +
//                ", hourlyPay : " + hourlyPay +
//                ", salary : " + getSalary();
//    }
//
//    public int getWorkingHours() {
//        return workingHours;
//    }
//
//    public int getHourlyPay() {
//        return hourlyPay;
//    }
//
//    public void setHourlyPay(int hourlyPay) {
//        this.hourlyPay = hourlyPay;
//    }
//}
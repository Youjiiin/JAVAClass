package quiz2;

public class Employee extends Person {
    private String department;
    private int salary;

    // Constructor
    public Employee(String name, int age, int height, String department){
        super(name, age, height);
        this.department = department;
    }
    public Employee(String name, int age, int height, String department, int salary){
        super(name, age, height);
        this.department = department;
        this.salary = salary;
    }

    // Override toString()
    public String toString() {
        return "Employee{" +
                "name='" + super.getName() + '\'' +
                ", age=" + super.getAge() +
                ", height=" + super.getHeight() +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }

    //getters and setters
    public String getDepartment(){
        return this.department;
    }
    public int getSalary(){
        return this.salary;
    }
    public void setDepartment(String department){
        this.department = department;
    }
    public void setSalary(int salary){
        this.salary = salary;
    }
}

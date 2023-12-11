package quiz2;

public class InterfaceTester {
    public static void main(String[] args){
        Employee[] employees = new Employee[5];
        for (int i = 0; i<employees.length; i++){
            employees[i] = new Employee("name", 20+i, 170+2*i, "dep", (i+1)*1000);
        }

        AgeMeasurer ageMeasurer = new AgeMeasurer();
        HeightMeasurer heightMeasurer = new HeightMeasurer();
        SalaryMeasurer salaryMeasurer = new SalaryMeasurer();

        double meanAge = Data.average(employees, ageMeasurer);
        double meanHeight = Data.average(employees, heightMeasurer);
        double meanSalary = Data.average(employees, salaryMeasurer);

        System.out.println("average age : "+meanAge);
        System.out.println("average height : "+meanHeight);
        System.out.println("average salary : "+meanSalary);


    }
}

package Work;

class Car{
    private String company;
    private String model;
    private String color;
    private int id;

    private static int count = 0;

    Car(){} //기본생성자

    Car(String company, String model, String color){
        this.company = company;
        this.model = model;
        this.color = color;
    }

    {
        count++;
        id = count;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getId() {
        return id;
    }
}
public class Q3 {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.setColor("white");
        c1.setCompany("company1");
        c1.setModel("model1");
        Car c2 = new Car("company2", "model2", "black");

        System.out.println("c1 : " + c1.getCompany() + c1.getModel() + c1.getColor() + c1.getId());
        System.out.println("c2 : " + c2.getCompany() + c2.getModel() + c2.getColor()+ c2.getId());
    }
}

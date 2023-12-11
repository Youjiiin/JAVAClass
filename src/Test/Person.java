package quiz2;

public class Person {
    private String name;
    private int age, height;

    // Constructor
    public Person(){}
    public Person(String name, int age, int height){
        this.name = name;
        this.age = age;
        this.height = height;
    }

    // Override toString()
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                '}';
    }

    // getters and setters
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    public int getHeight(){
        return this.height;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setHeight(int height){
        this.height = height;
    }
}

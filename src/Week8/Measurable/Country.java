package Week8.Measurable;

public class Country implements Measurable{
	private String name;
	private double area;
	
	public Country(String name, double area)
	{
		this.name = name;
		this.area = area;
	}

	public double getMeasure() {
		return area;
	}
	public double getArea()
	{
		return area;
	}
	public String getName() 
	{
		return name;
	}
}

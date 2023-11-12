package Week8.Measurer;

public class Country {
	private String name;
	private double area;
	private long population;
	
	public Country(String name, double area, long population)
	{
		this.name = name;
		this.area = area;
		this.population = population;
	}

	public double getArea()
	{
		return area;
	}
	public String getName() 
	{
		return name;
	}
	public long getPopulation() {
		return population;
	}
}


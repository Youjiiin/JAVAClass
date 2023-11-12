package Week8.Measurer;

public class CountryAreaMeasurer implements Measurer{
	public double measure(Object anObject) {
		Country country = (Country)anObject;
		double area = country.getArea();
		return area;
	}
}

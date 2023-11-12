package Week8.Measurer;

public class PopulationMeasurer implements Measurer{
	public double measure(Object anObject) {
		Country country = (Country)anObject;
		return country.getPopulation();
	}
}

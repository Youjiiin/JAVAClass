package Week8.Measurer;

import java.awt.Rectangle;
public class MeasurerTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle[] rects = new Rectangle[] 
				{
						new Rectangle(5, 10, 20,30),
						new Rectangle(10, 20, 30, 40),
						new Rectangle(20, 30, 5, 15)
				};
		Measurer areaMeas = new AreaMeasurer();
		double averageArea = Data.average(rects, areaMeas);
		System.out.println("Average area of Rectangles: " + averageArea);

		Country[] countries =  new Country[3];
		countries[0] = new Country("Uruguay", 176220, 124500);
		countries[1] = new Country("Thailand", 513120, 3452190);
		countries[2] = new Country("Belgium", 30510, 54230);
		Measurer countryAreaMeas = new CountryAreaMeasurer();
		Measurer populationMeas = new PopulationMeasurer();
		System.out.println("Average area of Countries: " 
				+ Data.average(countries, countryAreaMeas));
		System.out.println("Average population of Countries: " 
				+ Data.average(countries, populationMeas));
		
	}

}

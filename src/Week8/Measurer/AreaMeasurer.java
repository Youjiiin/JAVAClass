package Week8.Measurer;

import java.awt.Rectangle;

public class AreaMeasurer implements Measurer{
	public double measure(Object anObject) {
		Rectangle aRectangle = (Rectangle)anObject;
		double area = aRectangle.getHeight()* aRectangle.getWidth();
		return area;
	}

}

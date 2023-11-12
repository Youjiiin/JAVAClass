package Week8.Measurable;

public class Data {
	
	public static double average(Measurable[] objects) {
		double sum = 0;
		for(Measurable obj: objects) {
			sum += obj.getMeasure();
		}
		
		if (objects.length >0 ) {
			return sum/objects.length;
		}
		else
			return 0;
	}
	
	public static Measurable larger(Measurable obj1, Measurable obj2) {
		if(obj1.getMeasure() >obj2.getMeasure()) {
			return obj1;
		}
		else {
			return obj2;
		}
	}

}

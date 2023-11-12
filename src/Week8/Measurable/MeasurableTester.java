package Week8.Measurable;
import java.util.Arrays;

public class MeasurableTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Measurable[] accounts = new Measurable[3];
		accounts[0] = new BankAccount();
		accounts[1] = new BankAccount(1000);
		accounts[2] = new BankAccount(2000);
		double averageBalance = Data.average(accounts);
		System.out.println("average balance: " + averageBalance);
		
		Measurable[] countries =  new Measurable[3];
		countries[0] = new Country("Uruguay", 176220);
		countries[1] = new Country("Thailand", 513120);
		countries[2] = new Country("Belgium", 30510);
		double averageArea = Data.average(countries);
		System.out.println("average area: " + averageArea);
		
		Measurable largerCountry = Data.larger(countries[0], countries[1]);
		Country large = (Country)largerCountry;
		System.out.println(large.getName() +" is larger country.");
		
		Country uruguay = new Country("Uruguay", 176220);
		Country thailand = new Country("Thailand", 513120);
		Measurable largerCountry1 = Data.larger(uruguay, thailand);
		Country large1 = (Country)largerCountry1;
		System.out.println(large1.getName() +" is larger country.");
		
		BankAccount[] accounts1 = new BankAccount[5];
		accounts1[0] = new BankAccount(3000);
		accounts1[1] = new BankAccount(400);
		accounts1[2] = new BankAccount(6700);
		accounts1[3] = new BankAccount(50);
		accounts1[4] = new BankAccount(4000);
		
		Arrays.sort(accounts1);
		for(BankAccount acc: accounts1) {
			System.out.println(acc.getBalance());
		}
		

	}

}

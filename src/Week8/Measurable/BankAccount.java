package Week8.Measurable;

public class BankAccount implements Measurable, Comparable{

	private int accountNumber;
	private int balance;
	private static int lastAssignedNumber = 100;
	
	public BankAccount() {
		lastAssignedNumber++;
		this.accountNumber = lastAssignedNumber;
		balance = 0;
	}
	
	public BankAccount(int balance) {
		lastAssignedNumber++;
		this.accountNumber = lastAssignedNumber;
		this.balance = balance;
	}
	public int compareTo(Object otherObject) {
		BankAccount other = (BankAccount)otherObject;
		if(this.balance < other.balance) {
			return -1;
		}
		else if (balance > other.balance) {
			return 1;
		}
		else {
			return 0;
		}
	}
	
	public double getMeasure() {
		return balance;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public int getBalance() {
		return balance;
	}

	public boolean deposit(int amount)
	{
		if (amount <0)
			return false;
		balance += amount;
		return true;
	}
	
	public boolean withdraw(int amount)
	{
		if (amount <0)
			return false;
		if (balance <amount)
			return false;
		balance -= amount;
		return true;
	}
	
	public boolean transfer(BankAccount other, int amount)
	{
		if (amount < 0)
			return false;
		if (balance <amount)
			return false;
		balance -= amount;
		other.deposit(amount);
		return true;
	}
}

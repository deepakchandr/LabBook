package Lab4;

public class Account extends Person1 {
	static long accNum = 10000;
	double balance;
	public Account() {}
	public Account(String nameString, float age, double balance) {
		super(nameString, age);
		accNum++;
		
		this.balance = balance;
	}
	
	public void deposit(double deposit) {
		this.balance = deposit + getBalance(); 
	}
	public void withdraw(double withdraw) {
		this.balance = getBalance()-withdraw;
		
	}
	public long getAccNum() {
		return accNum;
	}
	public void setAccNum(long accNum) {
		this.accNum = accNum;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	

}

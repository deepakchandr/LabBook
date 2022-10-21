package Lab4;

public class CurrentAccount extends Account {

	final double overdraftLimit = 500.0;

//	public CurrentAccount(String nameString, float age, long accNum, double balance) {
//		super(nameString, age, accNum, balance);
//				
//	}
	@Override
	public void withdraw(double withdraw) {
		if ((this.balance-withdrawh)>overdraftLimit) {
			super.withdraw(withdraw);
		}
		else {
			System.out.println("Over draft limit exceeded");
		}
	}

}

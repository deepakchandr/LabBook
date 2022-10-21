package Lab4;

public class SavingAccount extends Account{
	final double minBalance = 500.0;

	@Override
	public void withdraw(double withdraw) {
		if ((this.balance - withdraw)>minBalance) {
			super.withdraw(withdraw);
		}
		else {
			System.out.println("Minimum balance reached you cannot withdraw");
		}
	}
	
}


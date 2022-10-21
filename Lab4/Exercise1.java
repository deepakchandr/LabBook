package Lab4;

/*
 * Exercise1:   Create Person and Account Class as shown below in class diagram. Ensure minimum balance of INR 500 in a bank account is available.
 * a	Create Account for smith with initial balance as INR 2000 and for Kathy with initial balance as 3000.(accNum should be auto generated).
b	Deposit 2000 INR to smith account.
c	Withdraw 2000 INR from Kathy account.
d	Display updated balances in both the account.
e	Extend the functionality through Inheritance and polymorphism. Inherit two classes Savings Account and Current Account from account class. And Implement the following in the respective classes.

-	Savings Account
a	Add a variable called minimum Balance and assign final modifier.
b	Override method called withdraw (This method should check for minimum balance and allow withdraw to happen)

-	Current Account
a	Add a variable called overdraft Limit
b	Override method called withdraw (checks whether overdraft limit is reached and returns a Boolean value accordingly)


 * */

public class Exercise1 {

	public static void main(String[] args) {
		//Smith data entry
		Account account1 = new Account("Smith", 40, 2000);
		//Kathy data entry
		Account account2 = new Account("Kathy", 42, 3000);
		// deposit to smith account 
		account1.deposit(2000);
		// withdraw from kathy account
		account2.withdraw(2000);
		System.out.println("Balance of "+account1.getNameString()+" = "+account1.getBalance());
		System.out.println("Balance of "+account2.getNameString()+" = "+account2.getBalance());
		

	}

}

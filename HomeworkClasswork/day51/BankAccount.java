package day51;

public class BankAccount  {
String accountName;
long accountNumber;
double balance;

public BankAccount(String accountName, long accountNumber, double balance) {
	
	super();
	
	this.accountName = accountName;
	this.accountNumber = accountNumber;
	this.balance = balance;
	
	
	
	
	
}

@Override
public String toString() {
	return "BankAccount [accountName=" + accountName + ", accountNumber=" + accountNumber + ", balance=" + balance
			+ "]";
}

public void  deposit(int dep) {
	balance+=dep*100;
}
public void  withdraw(int with) {
	balance-=10*with;

	
	
}

}
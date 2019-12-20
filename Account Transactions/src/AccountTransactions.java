public class AccountTransactions {

	int number;
	private String accountNumber = Integer.toString(number);
	private int balance = 0;

	public AccountTransactions(String accountNumber, int balance) {
		super();
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public int getBalance() {
		return balance;
	}

	public void deposit(int transactionAmount) {
if(balance==0)
{
	System.out.println("Insufficient Balance");
} else {
		this.balance = (balance + transactionAmount);
		System.out.println("Your balance after the transaction is :" + balance);
}
	}

	public void withdraw(int transactionAmount) {
		if (balance < transactionAmount) {
			System.out.println("Insufficient Balance");
			System.out.println("Your balance after the transaction is :" + balance);
		} else {
			this.balance = (balance - transactionAmount);
			System.out.println("Your balance after the transaction is :" + balance);
		}
	}

}

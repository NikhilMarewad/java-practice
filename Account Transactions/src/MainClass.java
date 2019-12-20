import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		AccountTransactions acctran = new AccountTransactions("1000321", 5000);

		int accpick;
		int amt;

		System.out.println("Enter the Account Number ");
		String accountNumber = scn.nextLine();

		System.out.println("Enter the Account Balance ");
		int bal = Integer.parseInt(scn.nextLine());

		System.out.println("Enter 1 to deposit an amount, 2 to withdraw an amount ");
		accpick = scn.nextInt();

		switch (accpick) {

		case 1:
			if (accpick == 1) {
				System.out.println("Enter the amount to deposit");
				amt =scn.nextInt();
				acctran.deposit(amt);
				break;
			}

		case 2:
			if (accpick == 2) {
				System.out.println("Enter the amount to withdraw");
				amt = scn.nextInt();
				acctran.withdraw(amt);
				break;
			}
		default:
			System.out.println("Sorry you have enterd worng number");
			break;
		}

	}

}

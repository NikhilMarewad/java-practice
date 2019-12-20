import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		ProfitLossMethod pld = new ProfitLossMethod();

		System.out.println("Enter the number of dozens of toys purchased");
		int dozenCount = scn.nextInt();

		System.out.println("Enter the price per dozen");
		int pricePerDozen = scn.nextInt();

		System.out.println("Enter the selling price of 1 toy");
		int sellPrice = scn.nextInt();

		pld.calculateProfit(dozenCount,pricePerDozen, sellPrice);

	}

}

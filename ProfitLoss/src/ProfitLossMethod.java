
public class ProfitLossMethod {

	public float calculateProfit(int dozenCount, int pricePerDozen, int sellPrice) {

		double price = pricePerDozen / 12;
		double profit = sellPrice - price;
		double percent = (profit / price) * 100;

		System.out.printf("Sam's profit percentage is %.2f", percent);

		System.out.print("Percentage");

		return 0;
	}

}

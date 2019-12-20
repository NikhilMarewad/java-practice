import java.util.Scanner;
class DiscountCalculation
{
	public static void main(String...arg)
	{
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Item 1 price");
		float Item1=scn.nextFloat();
		
		System.out.println("Item 2 price");
		float Item2=scn.nextFloat();
		
		System.out.println("Discount");
		int Discount=scn.nextInt();
		
		float totalAmount=(Item1+Item2);
		float discountedAmount=(((float)Discount/100)*totalAmount);
		float savedAmount=(totalAmount-discountedAmount);
		
		
		System.out.println("Price of item 1 : "+Item1);
		
		System.out.println("Price of item 2 : "+Item2);
		
		System.out.println("Discount in percentage : "+Discount);
		
		System.out.println("Total amount : $"+totalAmount);
		
		System.out.println("Discounted amount :  $"+savedAmount);
		
		System.out.println("Saved amount : $"+discountedAmount);
		
	}
}
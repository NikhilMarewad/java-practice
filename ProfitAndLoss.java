import java.util.Scanner;
class ProfitAndLoss
{
	public static void main(String...arg)
	{
		Scanner scn = new Scanner(System.in);
		int x,y,z;
	    double costPrice,profit,sellingPrice; 
		
        System.out.println("Enter the number of dozens of toys purchased");	
		x=scn.nextInt();
		
		System.out.println("Enter the selling price of 1 toy");	
		y=scn.nextInt();
		
		System.out.println("Enter the price per dozen");	
		z=scn.nextInt();
		
		costPrice=(y/12);
		sellingPrice=z;
		double profit2=(sellingPrice-costPrice);
		profit=((profit2/costPrice)*100);
		
		System.out.println("Number of dozens purchased :"+x);	
		
		System.out.println("Cost per dozen :"+y);	
		
		System.out.println("Selling price per item:"+z);	
		
		System.out.printf("Sam's profit percentage is %.2f" , profit);	
		
		System.out.print("Percentage");
	}
}
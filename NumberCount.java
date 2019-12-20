import java.util.Scanner;
class NumberCount
{
	public static void main(String...arg)
	{
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter the first number  ");
		int x=scn.nextInt();
		
		System.out.println("Enter the second number ");
		int y=scn.nextInt();
		
		
		if(x==y)
		{
			System.out.println(+x+" is equal to "+y);
		}
		else if(x>y)
		{
		    System.out.println(+x+"is greater than"+y);
		}	
		else 
			{
		    System.out.println(+x+"is less than"+y);
		}
		
		
	}
}
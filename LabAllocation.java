import java.util.Scanner;
class LabAllocation
{
	public static void main(String...arg)
	{
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter x ");
		int x=scn.nextInt();
		
		System.out.println("Enter y");
		int y=scn.nextInt();
		
		System.out.println("Enter z");
		int z=scn.nextInt();
		
		
		if(x<y && x<z)
		{
			System.out.println("L1 has the minimal seating capacity");
		}
		else if(y<x && y<z)
		{
		    System.out.println("L2 has the minimal seating capacity");
		}	
		else 
			{
		    System.out.println("L3 has the minimal seating capacity");
		}
	}
}
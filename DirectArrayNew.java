import java.util.Scanner;
class DirectArrayNew
{
	public static void main(String...arg)
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the day number");
		int no=scn.nextInt();
		String arr[]=new String[7];
		
		arr[0]="Sat";
		arr[1]="Sun";
		arr[2]="Mon";
		arr[3]="Tue";
		arr[4]="Wed";
		arr[5]="Thr";
		arr[6]="Fri";
		
		
		int index=no%7;
		
			System.out.println("Day of the week is : "+arr[index]);
		
		
	
	}
}
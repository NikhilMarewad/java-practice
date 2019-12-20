import java.util.Scanner;
class DirectArray
{
	public static void main(String...arg)
	{
		Scanner scn = new Scanner(System.in);
		String arr[]={"Sat","Sun","Mon","Tue","Wed","Thr","Fri"};
				
		System.out.println("Enter the day number");
		int no=scn.nextInt();
				
		for(int i=0;i<no;i++)
		{

		System.out.println("Day of the week is : "+arr[no]);
		break;
		}
	
	}
}
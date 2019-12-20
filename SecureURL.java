import java.util.Scanner;
class SecureURL
{
	public static void main(String...arg)
	{
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter the string ");
		String word=scn.next();
		
		System.out.println("Enter the start string  ");
		String word2=scn.next();
		
		
	   
		
		if(word.startsWith(word2))
		{
			System.out.println("start with 'https'"  );
		}
		else
		{
		System.out.println(" does not start with 'https' "  );
		}	
		
	}
}
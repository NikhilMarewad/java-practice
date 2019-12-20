import java.util.Scanner;
class Replace
{
	public static void main(String...arg)
	{
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter the content of the document");
		String word1=scn.nextLine();
			
		System.out.println("Enter the old name of the company ");
		String word2=scn.nextLine();
		
		System.out.println("Enter the new name of the company ");
		String word3=scn.nextLine();
		
		String word4=word1.replace(word2,word3);
		
		System.out.println(word4);
		
		
	}
}
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		AreaShape area=new AreaShape(null);
		
		int Pick;
		int len;

		int bre;
		int side;
		int r;

		System.out.println("1. Rectangle \n" + "\n" + "2. Square \n" + "\n" + "3. Circle ");
		System.out.println("Area Calculator --- Choose your shape");
		Pick = scn.nextInt();

		switch (Pick) {

		case 1:
			if (Pick == 1) {
				System.out.println("Enter length and breadth: ");
				len = scn.nextInt();
				bre = scn.nextInt();
				area = new Rectangle( len, bre);
				
				break;
			}

		case 2:

			if (Pick == 2) {
				System.out.println("Enter side: ");
				side = scn.nextInt();
				area=new Square( side);
			
				break;
			}

		case 3:
			if (Pick == 3) {
				System.out.println("Enter Radius: ");
				r = scn.nextInt();
				area= new Circle(r);
				
				break;
			}
		default:
			System.out.println("Sorry you have enterd worng number");
			break;
		}

		System.out.printf("Area of %s is:%.2f",area.getShapeName(),area.calculateArea());
		
		
	}

}

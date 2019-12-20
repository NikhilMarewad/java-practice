import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		GenC g = new GenC(969143, "John");
		GenC g1 = new GenC(969144, "priya");

		System.out.println("Enter the number of GenCs");
		int gen = Integer.parseInt(s.nextLine());
		
		for (int i = 0; i < gen; i++) {
			System.out.println("Enter the Employee Id");
			int empId = Integer.parseInt(s.nextLine());
			g.setEmpId(empId);

			System.out.println("Enter the name");
			String name = s.nextLine();
			g.setName(name);
		}

		g.display();
		g1.display();

}
}

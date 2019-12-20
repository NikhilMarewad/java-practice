import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
		
		ProDetCon pdc = new ProDetCon(1,"printer","Hp");
		
		System.out.println("Enter the product id ");
		long id = Long.parseLong(scn.nextLine());
		pdc.setid(id);
       
		System.out.println("Enter the product name ");
		String Pname = scn.nextLine();
	    pdc.setProductName(Pname);

		System.out.println("Enter the supplier name ");
		String Sname = scn.next();
		pdc.setSupplierName(Sname);
		
		pdc.display();
	

	}

}

import java.util.*;

public class MainClass {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		
		ProductDetails pd = new ProductDetails();
		
		System.out.println("Enter the product id ");
		long id =Long.parseLong(scn.nextLine());
		pd.setid(id);
       
		System.out.println("Enter the product name ");
		String Pname = scn.nextLine();
	    pd.setProductName(Pname);

		System.out.println("Enter the supplier name ");
		String Sname = scn.next();
		pd.setSupplierName(Sname);
		
		pd.display();
	//	System.out.println("Product id "+pd.getId());

	//	System.out.println("Product Name is "+pd.getProductName());

	//	System.out.println("Supplier Name is "+pd.getSupplierName());
		

	}

}

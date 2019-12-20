
public class ProDetCon {
	private long id;
	private String productName;
	private String supplierName;
	
	
	public ProDetCon(long ID,String Pname,String Sname)
	{
	this.id=ID;
	this.productName=Pname;
	this.supplierName=Sname;
	}
	
	
	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {

		this.productName = productName;

	}

	public String getSupplierName() {
		return supplierName;
	}

	public void setSupplierName(String supplierName) {

		this.supplierName = supplierName;

	}

	public void setid(long Id) {

		this.id = Id;

	}

	public long getId() {
		return id;
	}

	public void display() {
		System.out.println("Product id " +getId());

		System.out.println("Product Name is " + getProductName());

		System.out.println("Supplier Name is " +getSupplierName());
	}

}

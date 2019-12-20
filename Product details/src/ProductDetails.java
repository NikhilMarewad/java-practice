
public class ProductDetails {

	private long id;
	private String productName;
	private String supplierName;

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
		System.out.println("Product id " + id);

		System.out.println("Product Name is " + productName);

		System.out.println("Supplier Name is " + supplierName);
	}

}

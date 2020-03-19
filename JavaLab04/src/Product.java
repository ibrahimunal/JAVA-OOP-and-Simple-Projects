
public class Product {
	private static int productNo=1;
	private int PN;
	private String productName;
	private String productType;
	private int productPrice;
	public int getProductNo() {
		return productNo;
	}
	
	public void setProductNo(int productNo) {
		this.productNo = productNo;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductType() {
		return productType;
	}
	public void setProductType(String productType) {
		this.productType = productType;
	}
	public int getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}
	public Product(String productName, String productType, int productPrice) {
		super();
		this.productNo = productNo;
		this.productName = productName;
		this.productType = productType;
		this.productPrice = productPrice;
		PN=productNo;
		productNo ++;
	}
	@Override
	public String toString() {
		return  this.productName+" ("+this.productType+") "+this.productPrice +"$";
	}
	public int getPN() {
		return PN;
	}
	public void setPN(int pN) {
		PN = pN;
	}

}
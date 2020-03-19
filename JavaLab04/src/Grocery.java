
public class Grocery implements StockInterface {
private Product product;
private int SalePrice;
private int Amount;

	
	public Grocery(Product product,  int amount,int salePrice) {
	super();
	this.product = product;
	SalePrice = salePrice;
	Amount = amount;
}


	public Product getProduct() {
	return product;
}


public void setProduct(Product product) {
	this.product = product;
}


public int getSalePrice() {
	return SalePrice;
}


public void setSalePrice(int salePrice) {
	SalePrice = salePrice;
}


public int getAmount() {
	return Amount;
}


public void setAmount(int amount) {
	Amount = amount;
}


	public interface StockInterface {

	    void setStockAmount(int newAmount);
	    void setStockPrice(int newPrice);
	    int getStockValue();
	    int getStockPrice();

	    // The format is;
	    // Product.toString(), selling at <SalePrice>$ with <Amount> left in stock
	    String toString();
	}


	@Override
	public void setStockAmount(int newAmount) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void setStockPrice(int newPrice) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public int getStockValue() {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public int getStockPrice() {
		// TODO Auto-generated method stub
		return 0;
	}
	public String toString(){
	    
	 return "Product #"+product.getPN()+": "+product.toString()+", selling at "+this.SalePrice+"$ with " + Amount + " left in stock";
	}

}
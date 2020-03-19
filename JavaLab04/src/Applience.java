
public class Applience implements StockInterface  {
private Product product;
private int SalePrice;
private int Amount;
private String Origin;
	
	public Applience(Product product, int amount, int salePrice, String origin) {
	
	this.product = product;
	this.SalePrice = salePrice;
	this.Amount = amount;
	this.Origin=origin;
}

	

	public Product getProduct() {
	return product;
}


public void setProduct(Product product) {
	this.product = product;
}
	


	@Override
	public void setStockAmount(int amount) {
		// TODO Auto-generated method stub
		Amount = amount;
		
	}


	@Override
	public void setStockPrice(int newPrice) {
		SalePrice = newPrice;
		
	}


	@Override
	public int getStockValue() {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public int getStockPrice() {
		
		return SalePrice;
		
	

	}
		public String toString(){
	    
	 return   "Product #"+product.getPN()+": "+product.toString()+", made in "+Origin+", selling at " +this.SalePrice+"$ with "+this.Amount
							+" left in stock";
	}
	    
}

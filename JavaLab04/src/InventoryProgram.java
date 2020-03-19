import java.util.ArrayList;
import java.util.Scanner;
public class InventoryProgram {
	static ArrayList<Product>ArrProducts;
	static ArrayList<StockInterface> ArrGrocery;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String input ="";
		ArrProducts=new ArrayList<Product>();
		ArrGrocery=new ArrayList<StockInterface>();



		do{

			input=sc.next();
			switch(input) {
			case "p" :{
				String productName=sc.next();
				String productType=sc.next();
				int ProductPrice=sc.nextInt();
				Product product=new Product(productName,productType,ProductPrice);
				ArrProducts.add(product);
				System.out.println("Product #"+product.getPN()+": "+product.toString());


				break;
			}

			case "g": 
				int productNumber=sc.nextInt();
				int productAmount=sc.nextInt();
				int salePrice=sc.nextInt();

				Grocery grocery=new Grocery(ArrProducts.get(productNumber-1) ,productAmount,salePrice);
				ArrGrocery.add(grocery);
				if(ArrProducts.get(productNumber-1).getProductPrice()>salePrice) {
					System.out.println("Warning. Sale price is lower than product cost");
				}
				break;
				
			case "a":
				int productId=sc.nextInt();
				int product_Amount=sc.nextInt();
				int SalePrice=sc.nextInt();
				String origin=sc.next();
				
				Applience app=new Applience(ArrProducts.get(productId-1),product_Amount,SalePrice,origin);
				ArrGrocery.add(app);
				
				break;

			case "q":
				for(int i=0; i<ArrGrocery.size(); i++) {
				
					System.out.println(ArrGrocery.get(i).toString());
				}
				break;

			}			


		}






		while(!input.equals("q"));


	}

}

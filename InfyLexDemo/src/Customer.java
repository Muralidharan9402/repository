import java.util.HashMap;
import java.util.Map;

public abstract class Customer {


	Map<String, Integer> productDetails = new HashMap<String, Integer>();
	
	Customer(){
		productDetails.put("Mobile",10000);
		productDetails.put("Sony TV", 40000);
		productDetails.put("Watch", 5000);
	}
	
	public abstract double calculatePurchaseAmount(String product);
		
	/*	double price = productDetails.get(product);
		double totalPrice = price+(18/100);
		
		return totalPrice;
		*/
	

/*	@Override
	public double chargeOnDelivery() {
		// TODO Auto-generated method stub
		return 50;
	}*/

}


public class RegularCustomer extends Customer implements AfterSale{

	@Override
	public double chargeOnDelivery() {
		// TODO Auto-generated method stub
		return 60;
	}

	@Override
	public double calculatePurchaseAmount(String product) {
		// TODO Auto-generated method stub
		
		double price = productDetails.get(product);
		System.out.println("Gift Values:"+AfterSale.issueGift(price));
		return price+chargeOnDelivery();
	}
	
}

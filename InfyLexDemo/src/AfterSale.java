
public interface AfterSale {
	
	double DISCOUNT_RATE = 5.0;
	public double chargeOnDelivery();
	
	public default double discount() {
		return DISCOUNT_RATE/100;
	}
	public static String issueGift(double price) {
		if(price<=5000){ return "Silver";}
		if(price>=10000) { return "Gold";}
		if(price>=30000) { return "Platinum";}
		else
			return "Better Luck next Time";
		
	}

}

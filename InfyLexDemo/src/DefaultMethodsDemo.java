
public class DefaultMethodsDemo {

	public static void main(String[] args) {
		PrivilegedCustomer prCustomer = new PrivilegedCustomer();
		RegularCustomer rCustomer = new RegularCustomer();
		
		System.out.println(prCustomer.calculatePurchaseAmount("Mobile"));
		System.out.println(rCustomer.calculatePurchaseAmount("Sony TV"));
	}
	
}

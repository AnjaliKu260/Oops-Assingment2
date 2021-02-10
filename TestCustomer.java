package Num1;

public class TestCustomer {
	
	
	public static void main(String[] args) {
		Address ad=new Address("1st Main road Btm","Bangolre");
		
		
		Customer tc=new Customer("Anjali",ad);
		tc.getResidentialAddress();
		tc.getCustomerDetails();

		
	}

}

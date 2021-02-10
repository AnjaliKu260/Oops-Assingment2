package Num1;

public class Customer {
	//private static final String Addressdetails = " 1st main road,Btm ,Bangalore";
	private String CustomerName;
	Address ResidentialAddress;

	Customer(String customerName, Address ResidentialAddress) {

		this.CustomerName = customerName;
		this.ResidentialAddress =ResidentialAddress;
	}
	public void getCustomerDetails() {
		System.out.println("customer " + CustomerName );
		System.out.println("ResidentialAddress "  +ResidentialAddress.getAddressLine()+ " " + ResidentialAddress.getCity());
		

	}
	public String getCustomerName() {
		return CustomerName;
	}
	public void setCustomerName(String customerName) {
		CustomerName = customerName;
	}
	public Address getResidentialAddress() {
		return ResidentialAddress;
	}
	public void setResidentialAddress(Address residentialAddress) {
		ResidentialAddress = residentialAddress;
	}

}



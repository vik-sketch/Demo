
public class DebugCode {

	public void makePayment(String username, String password) {
		System.out.println("payment done successfully using username and password");
	}
	
	public void makePayment(Long mobileNumber, int password) {
		System.out.println("payment done successfully using mobile number and passcode");
	}
	
	public void makePayment(String username, int password) {
		System.out.println("payment done successfully using username and passcode");
	}
	
	public static void main(String[] args) {

		DebugCode d = new DebugCode();	// step into means control will go into the function and show execution line by line
		d.makePayment("vikash",5555);
		d.makePayment(8340464019L,5555);	// step over means control will not penetrate into the code n go to next line						
		d.makePayment("vikash","vikash7044");
	}

}

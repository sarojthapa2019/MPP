package prob2;

public class LibraryMember {
	private String memberId;
	private String firstName;
	private String lastName;
	private String phone;
	private CheckoutRecord cr;
	// constructor
	public LibraryMember(String memberId, String firstName, String lastName, String phone) {
		
		this.memberId = memberId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
	}
	// getters only
	public String getMemberId() {
		return memberId;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getPhone() {
		return phone;
	}
	// setters
	public void setCheckoutRecord(CheckoutRecord cr) {
		this.cr = cr;
	}
	// get special
	public CheckoutRecord getCheckoutRecord() {
		return cr;
	}
	
	
}



public class Contact {
	private String contactID;
	private String firstName;
	private String lastName;
	private String phone;
	private String address;
	
	// verifies that the input variables meet the requirements
	private boolean checkContactID (String contactID) {
		if (contactID == null || contactID.length() > 10) {
			return false;
		}
		return true;
	}
	boolean checkFirstName (String firstName) {
		if (firstName == null || firstName.length() > 10) {
			return false;
		}
		return true;
	}
	private boolean checkLastName (String lastName) {
		if (lastName == null || lastName.length() > 10) {
			return false;
		}
		return true;
	}
	private boolean checkPhone (String phone) {
		if (phone == null || phone.length() != 10) {
			return false;
		}
		return true;
	}
	private boolean checkAddress (String address) {
		if (address == null || address.length() > 30) {
			return false;
		}
		return true;
	}
	
	// Parameterized constructor 
	// Checks parameters for their validity.
	public Contact(String contactID,
			String firstName,
			String lastName,
			String phone,
			String address) {
		if (!this.checkContactID(contactID)) {
			throw new IllegalArgumentException("Contact ID is not valid");
		}
		if (!this.checkFirstName(firstName)) {
			throw new IllegalArgumentException("First name is not valid");
		}
		if (!this.checkLastName(lastName)) {
			throw new IllegalArgumentException("Last name is not valid");
		}
		if (!this.checkPhone(phone)) {
			throw new IllegalArgumentException("Phone number is not valid");
		}
		if (!this.checkAddress(address)) {
			throw new IllegalArgumentException("Address is not valid");
		}
		
		// Assigns the parameters to the Contact class' private variables
		this.contactID = contactID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
		this.address = address;
	}
		
	// get the member variables of a Contact object
	public int getContactID() {
		return Integer.valueOf(contactID);
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getPhoneNumber() {
		return phone;
	}
	public String getAddress() {
		return address;
	}
	
	// set the member variables of a Contact object
	// we must perform the individual validity tests for each new parameter

	// The contact ID is unique for each contact, and it may not be updated.
//	public void setContactID(String contactID) {
//		if (!this.checkContactID(contactID)) {
//			throw new IllegalArgumentException("Contact ID is not valid");
//		}
//		this.contactID = contactID;
//	}
	
	public void setFirstName(String firstName) {
		if (!this.checkFirstName(firstName)) {
			throw new IllegalArgumentException("First name is not valid");
		}
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		if (!this.checkLastName(lastName)) {
			throw new IllegalArgumentException("Last name is not valid");
		}
		this.lastName = lastName;
	}
	public void setPhoneNumber(String phone) {
		if (!this.checkPhone(phone)) {
			throw new IllegalArgumentException("Phone number is not valid");
		}
		this.phone = phone;
	}
	public void setAddress(String address) {
		if(!this.checkAddress(address)) {
			throw new IllegalArgumentException("Invalid address");
		}	
		this.address = address;
	}
}

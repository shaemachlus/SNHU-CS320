import java.util.ArrayList;
import java.util.List;

// Contact service provides create, update, and delete methods to a list of Contact objects

public class ContactService {
	// sets the object's placement in the list
	int currentIDNum = 0;
	public static List<Contact> contactList = new ArrayList<Contact>();
	
	// Create 
	public void addContact(String firstName, String lastName, String phone, String address) {
		//Cast the list position marker as a String to define a new Contact
		String stringID = Integer.toString(currentIDNum);
		Contact newContact = new Contact(stringID, firstName, lastName, phone, address);
		contactList.add(newContact.getContactID(), newContact);
		//Update the list position counter to append the next element to the list
		++currentIDNum;
	}
	// Delete using the Contact ID (unique and static)
	public void deleteContact(String ID) {
		int intID = Integer.valueOf(ID);
		//Iterate through the list until the ID'ed contact is found, then remove it
		for(int i = 0; i < ContactService.contactList.size(); i++) {
			if(ContactService.contactList.get(i).getContactID() == intID) {
				contactList.remove(i);
			}
			
		}
	}
	// Iterate through contact list to find desired contact
	// using the contactID. Then edit one of the contact's parameters.
	
	// Edit (first name)
	// Requires contact list position and the updated name
	public void editFirstName(String contactID, String firstName) {
		for(Contact iter : contactList) {
			if (iter.getContactID() == Integer.valueOf(contactID)) {
				iter.setFirstName(firstName);
			}
		}
	}
	// Edit (last name)
	// Requires contact list position and the updated name
	public void editLastName(String contactID, String lastName) {
		for(Contact iter : contactList) {
			if (iter.getContactID() == Integer.valueOf(contactID)) {
				iter.setLastName(lastName);
			}
		}
	}
	// Edit (phone)
	// Requires contact list position and the updated phone number
	public void editNumber (String contactID, String phone) {
		for (Contact iter : contactList) {
			if (iter.getContactID() == Integer.valueOf(contactID)) {
				iter.setPhoneNumber(phone);
			}
		}
	}
	// Edit (address)
	// Requires contact list position and the updated address
	public void editAddress (String contactID, String address) {
		for (Contact iter : contactList) {
			if (iter.getContactID() == Integer.valueOf(contactID)) {
				iter.setAddress(address);
			}
		}
	}
}

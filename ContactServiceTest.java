import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterEach;

public class ContactServiceTest {
	
	//reset the contact list for each test
	@AfterEach
	void tearDown() throws Exception {
		ContactService.contactList.clear();
	}
	
	@Test
	void testAddContact() {
		
		// int currentIDnum = 0; //adding a contact to an empty list
		String firstName = "Shae"; // sample data
		String lastName = "Machlus";
		String phoneNumber = "5552704396";
		String address = "5555 Malibu";
		ContactService cs = new ContactService();
		
		// Add a Contact to the ContactService object
		cs.addContact(firstName, lastName, phoneNumber, address);
		
		// Check that each field was added
		assertEquals(0, ContactService.contactList.get(0).getContactID());
		assertEquals(firstName, ContactService.contactList.get(0).getFirstName());
		assertEquals(lastName, ContactService.contactList.get(0).getLastName());
		assertEquals(phoneNumber, ContactService.contactList.get(0).getPhoneNumber());
		assertEquals(address, ContactService.contactList.get(0).getAddress());
		
		//Reset list for next test
		ContactService.contactList.clear();
	}
	
	@Test
	void testDeleteContact() {
		String firstName = "Shae"; // sample data
		String lastName = "Machlus";
		String phoneNumber = "5552704396";
		String address = "5555 Malibu";
		ContactService cs = new ContactService();
		
		//Make sure the list is empty
		assertTrue(ContactService.contactList.isEmpty());
		
		// Add three Contacts to the list
		cs.addContact(firstName, lastName, phoneNumber, address);
		cs.addContact(firstName, lastName, phoneNumber, address);
		cs.addContact(firstName, lastName, phoneNumber, address);
		
		//Make sure three Contacts were added
		assertEquals(3, ContactService.contactList.size());
		
		//Delete the Contact with index 1
		cs.deleteContact("1");
		
		//Confirm only two Contacts remain in the list
		assertEquals(2, ContactService.contactList.size());
	}
		
	@Test
	void testEditPhone() {
			String firstName = "Shae"; // sample data
			String lastName = "Machlus";
			String phoneNumber = "5552704396";
			String address = "5555 Malibu";
			ContactService cs = new ContactService();
			
			// Add a Contact to the list
			cs.addContact(firstName, lastName, phoneNumber, address);
			
			// Confirm the phoneNumber in the added Contact
			// matches the phoneNumber found in the contact list
			assertEquals(phoneNumber, ContactService.contactList.get(0).getPhoneNumber());
			
			// Change the number and check for the change in the list
			cs.editNumber("0", "5555555555");
			assertEquals("5555555555", ContactService.contactList.get(0).getPhoneNumber());
			
			//repeat for first name, last name, and address
	}
	
	@Test
	void testEditFirstName() {
		String firstName = "Shae"; // sample data
		String lastName = "Machlus";
		String phoneNumber = "5552704396";
		String address = "5555 Malibu";
		ContactService cs = new ContactService();
		cs.addContact(firstName, lastName, phoneNumber, address);
		assertEquals(firstName, ContactService.contactList.get(0).getFirstName());
		cs.editFirstName("0", "Seth");
		assertEquals("Seth", ContactService.contactList.get(0).getFirstName());
	}
	
	@Test
	void testEditLastName() {
		String firstName = "Shae"; // sample data
		String lastName = "Machlus";
		String phoneNumber = "5552704396";
		String address = "5555 Malibu";
		ContactService cs = new ContactService();
		cs.addContact(firstName, lastName, phoneNumber, address);
		assertEquals(lastName, ContactService.contactList.get(0).getLastName());
		cs.editLastName("0", "Smith");
		assertEquals("Smith", ContactService.contactList.get(0).getLastName());
	}
	
	@Test
	void testEditAddress() {
		String firstName = "Shae"; // sample data
		String lastName = "Machlus";
		String phoneNumber = "5552704396";
		String address = "5555 Malibu";
		ContactService cs = new ContactService();
		cs.addContact(firstName, lastName, phoneNumber, address);
		assertEquals(address, ContactService.contactList.get(0).getAddress());
		cs.editAddress("0", "4321 Ocean Drive");
		assertEquals("4321 Ocean Drive", ContactService.contactList.get(0).getAddress());
	}
	
}

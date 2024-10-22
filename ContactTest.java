import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ContactTest {
	@Test
	void testSuccessfulCreation() {
		Contact contact = new Contact("1", "FirstName", "LastName", 
				"5551234567", "5555 StreetName");
		assertTrue(String.valueOf(contact.getContactID()).equals("1"));
		assertTrue(contact.getFirstName().equals("FirstName"));
		assertTrue(contact.getLastName().equals("LastName"));
		assertTrue(contact.getPhoneNumber().equals("5551234567"));
		assertTrue(contact.getAddress().equals("5555 StreetName"));
	}
	
	@Test
	void testSetFirstName() {
		Contact contact = new Contact("1", "FirstName", "LastName", 
				"5551234567", "5555 StreetName");
		contact.setFirstName("Firsty");
		assertTrue(contact.getFirstName().equals("Firsty"));
	}

	@Test
	void testSetLastName() {
		Contact contact = new Contact("1", "FirstName", "LastName", 
				"5551234567", "5555 StreetName");
		contact.setLastName("Lasty");
		assertTrue(contact.getLastName().equals("Lasty"));
	}
	
	@Test
	void testSetPhoneNumber() {
	Contact contact = new Contact("1", "FirstName", "LastName", 
		"5551234567", "5555 StreetName");
	contact.setPhoneNumber("1234567890");
	assertTrue(contact.getPhoneNumber().equals("1234567890"));
	}
	
	@Test
	void testSetAddress() {
	Contact contact = new Contact("1", "FirstName", "LastName", 
		"5551234567", "5555 StreetName");
	contact.setAddress("2222 Road");
	assertTrue(contact.getAddress().equals("2222 Road"));
	}
	
	@Test
	void nullID() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact(null, "FirstName", "LastName", 
					"5551234567", "5555 StreetName");
		});
	}
	
	@Test
	void nullFirstName() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1", null, "LastName", 
					"5551234567", "5555 StreetName");
		});
	}
	
	@Test
	void nullLastName() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1", "FirstName", null, 
					"5551234567", "5555 StreetName");
		});
	}
	
	@Test
	void nullPhoneNumber() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1", "FirstName", "LastName", 
					null, "5555 StreetName");
		});
	}
	@Test
	void nullAddress() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1", "FirstName", "LastName", 
					"5551234567", null);
		});
	}
	
	@Test
	void lengthID() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("12345678901", "FirstName", "LastName", 
					"5551234567", "5555 StreetName");
		});
	}
	
	@Test
	void lengthFirstName() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1", "FirstName123", "LastName", 
					"5551234567", "5555 StreetName");
		});
	}
	
	@Test
	void lengthLastName() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1", "FirstName", "LastName123", 
					"5551234567", "5555 StreetName");
		});
	}
	
	@Test
	void lengthPhoneNumber() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1", "FirstName", "LastName", 
					"12345678901", "5555 StreetName");
		});
	}

	
	@Test
	void lengthAddress() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1", "FirstName", "LastName", 
					"5551234567", "AddressMayNotBeLongerThanThirtyCharacters");
		});
	}
}
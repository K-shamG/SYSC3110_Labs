package test;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import buddy_labs.BuddyInfo;

public class TestBuddyInfo {
	private BuddyInfo buddyInfo;
	
	private String name = "test";
	private String address = "testAddress";
	private String phonenumber = "555-555-5555";

	@Before 
	public void setup() {
		buddyInfo = new BuddyInfo(name, address, phonenumber);
	}
	
	@Test
	public void testConstructorValid() {
		assertNotNull("Constructor object should not be null", buddyInfo);
	}
	
	@Test(expected = NullPointerException.class)
	public void testNullName() {
		buddyInfo = new BuddyInfo(null, address, phonenumber);
	}
	
	@Test(expected = NullPointerException.class)
	public void testNullAddress() {
		buddyInfo = new BuddyInfo(name, null, phonenumber);
	}
	
	@Test
	public void testCopyConstructor() {
		BuddyInfo b = new BuddyInfo(buddyInfo);
		assertEquals("buddy should have same name as buddyInfo", name, b.getName());
		assertEquals("buddy should have same address as buddyInfo", address, b.getAddress());
		assertEquals("buddy should have same phone number as buddyInfo", phonenumber, b.getNumber());
	}
	
	@Test
	public void testToString() {
		assertEquals("Should say 'Salut test'", "Salut " + name, buddyInfo.greeting());
	}
	
	@Test
	public void testIsOver18() {
		buddyInfo.setAge(25);
		assertTrue("Should be true", buddyInfo.isOver18());
		
		buddyInfo.setAge(12);
		assertFalse("Should be false", buddyInfo.isOver18());
		
		buddyInfo.setAge(18);
		assertFalse("Should be false", buddyInfo.isOver18());
	}

}

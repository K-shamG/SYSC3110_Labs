package buddy_labs;

import org.omg.PortableInterceptor.ServerRequestInterceptor;

public class BuddyInfo {
	private String name; 
	private String address;
	private String number;
	
	public BuddyInfo() {
		this(null, null, null);
	}
	
	public BuddyInfo(String name, String address, String number) {
		this.name = name;
		this.address = address;
		this.number = number;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	
	public String toString() {
		return "Name: " + name + ", Address: " + address + ", Phone Number: " + number; 
	}
	
	public static void main(String[] args) {
		String name = "Kshamina";
		String address = "333 Cool Lane";
		String number = "555-555-5555";
		
		BuddyInfo buddy = new BuddyInfo(name, address, number);
		System.out.println(buddy.toString());
				
	}
}

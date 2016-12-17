package buddy_labs;

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
		return "Hello " + name + "!"; 
	}
	
	public static void main(String[] args) {
		String name = "Kshamina";
		
		BuddyInfo buddy = new BuddyInfo();
		buddy.setName(name);
		System.out.println(buddy.toString());
				
	}
}

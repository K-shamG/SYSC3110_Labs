package buddy_labs;

public class BuddyInfo {
	private String name; 
	private String address;
	private String number;
	private int age; 
		
	public BuddyInfo(String name, String address, String number) {
		if(name.equals(null) || address.equals(null) || number.equals(null)) throw new NullPointerException(); 
		this.name = name;
		this.address = address;
		this.number = number;
	}
	
	public BuddyInfo(BuddyInfo b) {
		this(b.getName(), b.getAddress(), b.getNumber());
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
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public boolean isOver18() {
		return age > 18; 
	}
	
	public String toString() {
		return "Name: " + name + ", Address: " + address + ", Phone Number: " + number; 
	}
	
	public String greeting() {
		return "Salut " + name; 
	}
	
	public static void main(String[] args) {
		String name = "Kshamina";
		String address = "333 Cool Lane";
		String number = "555-555-5555";
		
		BuddyInfo buddy = new BuddyInfo(name, address, number);
		System.out.println(buddy.toString());
				
	}
}

package buddy_labs;

import java.util.ArrayList;

public class AddressBook {
	private ArrayList<BuddyInfo> buddies;
	
	public AddressBook() {
		buddies = new ArrayList<>();
	}
	
	public void addBuddy(BuddyInfo b){
		buddies.add(b);
	}
	
	public void removeBuddy(int i){
		buddies.remove(i);
	}
	
	public static void main(String[] args) {
		BuddyInfo b = new BuddyInfo("Kshamina", "333 Cool Lane", "555-555-5555");
		AddressBook book = new AddressBook();
		book.addBuddy(b);
		book.removeBuddy(0);
		
	}
}

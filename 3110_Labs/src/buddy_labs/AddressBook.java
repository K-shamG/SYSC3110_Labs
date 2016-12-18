package buddy_labs;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class AddressBook {
	private ArrayList<BuddyInfo> buddies;
	
	public AddressBook() {
		buddies = new ArrayList<>();
	}
	
	public void addBuddy(BuddyInfo b){
		if(b != null) buddies.add(b);
	}
	
	public void removeBuddy(int i){
		if(i >= 0 && i < buddies.size()) buddies.remove(i);
	}
	
	public String toString() {
		String s = "";  
		for(BuddyInfo b: buddies) {
			s+= b.toString() + "\n"; 
		}
		return s; 
	}
	
	public void toFile(String filename) throws IOException {
		BufferedWriter out = new BufferedWriter(new FileWriter(filename));
		out.write(this.toString());
		out.close(); 	
	}
	
	public static void main(String[] args) {
		BuddyInfo b = new BuddyInfo("Kshamina", "333 Cool Av", "555-555-5555");
		AddressBook book = new AddressBook();
		book.addBuddy(b);
		System.out.println(book.toString());
		book.removeBuddy(0);
		
	}
}

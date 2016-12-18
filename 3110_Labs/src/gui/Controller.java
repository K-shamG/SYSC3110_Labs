package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import buddy_labs.AddressBook;
import buddy_labs.BuddyInfo;

public class Controller implements ActionListener{
	private AddressBook book;
	private UserInterface view; 
	
	public Controller(UserInterface view) {
		this.view = view; 
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand() instanceof String) {
			String s = (String) e.getActionCommand();
			
			if(s.equals("create")) {
				book = new AddressBook(); 
				view.enableDisableMenu(true);
			}
			else if(s.equals("save")) {
				String filename = view.prompt("Enter the name of your file: ");
				filename += ".txt";
				try {
					book.toFile(filename);
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
			else if(s.equals("display")) {
				System.out.println(book.toString());
				view.displayingBuddies(book.toString());
			}
			else if(s.equals("add")) {
				String name = view.prompt("Enter a name: ");
				String address = view.prompt("Enter " + name + "'s address: ");
				String number = view.prompt("Enter " + name + "'s phone number: ");
				
				BuddyInfo b = new BuddyInfo(name, address, number);
				book.addBuddy(b);
			}
		}
	}

}

package buddy_labs;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class UserInterface extends JFrame {
	private static final long serialVersionUID = 1L;

	private JMenuBar bar;
	private JMenu addressMenu;
	private JMenu buddyMenu; 
	
	private JMenuItem create;
	private JMenuItem save;
	private JMenuItem display;
	private JMenuItem addBuddy; 
	
	private JTextArea text; 
	
	private Controller controller; 
	public static final String EMPTY_STRING = "";
	
	public UserInterface() {
		super();
		controller = new Controller(this); 
		createMenu();
		text = new JTextArea(); 
		
		this.setSize(300, 300);
		this.setLayout(new BorderLayout());
		this.add(bar, BorderLayout.NORTH);
		this.setVisible(true);
		
	}
	
	public void createMenu() {
		bar = new JMenuBar();
		addressMenu = new JMenu("Address Book");
		buddyMenu = new JMenu("BuddyInfo");
		bar.add(addressMenu);
		bar.add(buddyMenu);
		
		create = new JMenuItem("Create");
		save = new JMenuItem("Save");
		display = new JMenuItem("Display");
		addBuddy = new JMenuItem("Add Buddy");
		
		create.addActionListener(controller);
		save.addActionListener(controller);
		display.addActionListener(controller);
		addBuddy.addActionListener(controller);
		
		create.setActionCommand("create");
		save.setActionCommand("save");
		display.setActionCommand("display");
		addBuddy.setActionCommand("add");
		
		addressMenu.add(create);
		addressMenu.add(save);
		addressMenu.add(display);
		buddyMenu.add(addBuddy);
		
		enableDisableMenu(false);
	}
	
	public String prompt(String message){
		String s = EMPTY_STRING;
		s = JOptionPane.showInputDialog(message);
		if ((s != null) && (s.length() > 0)){
			return s;
		}
		return EMPTY_STRING; 
	}
	
	public void enableDisableMenu(boolean b) {
		display.setEnabled(b);
		save.setEnabled(b);
		addBuddy.setEnabled(b);
	}
	
	public void displayingBuddies(String string) {
		text = new JTextArea(); 
		text.setText(string);
		System.out.println(string);
		this.add(text, BorderLayout.CENTER);
	}
	
	public static void main(String[] args) {
		new UserInterface();
	}
}

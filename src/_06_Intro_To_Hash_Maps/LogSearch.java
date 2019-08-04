package _06_Intro_To_Hash_Maps;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Iterator;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class LogSearch implements ActionListener {

	HashMap<Integer, String> hm = new HashMap<Integer, String>();

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton addEntry = new JButton("Add Entry:");
	JButton searchByID = new JButton("Search by ID");
	JButton viewList = new JButton("View List:");
	JButton removeEntry = new JButton("Remove Entry");

	void GUI() {

		frame.add(panel);
		panel.add(addEntry);
		panel.add(searchByID);
		panel.add(viewList);
		panel.add(removeEntry);
		addEntry.addActionListener(this);
		searchByID.addActionListener(this);
		viewList.addActionListener(this);
		removeEntry.addActionListener(this);
		frame.pack();
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		if (e.getSource() == addEntry) {

			String idNumber = JOptionPane.showInputDialog("Enter an ID number");
			int ID = Integer.parseInt(idNumber);
			String name = JOptionPane.showInputDialog("Enter a name");
			hm.put(ID, name);

		}

		if (e.getSource() == searchByID) {

			String newIDNumber = JOptionPane.showInputDialog("Enter an ID number");
			int newID = Integer.parseInt(newIDNumber);
			if (hm.containsKey(newID)) {

				JOptionPane.showMessageDialog(null, hm.get(newID));

			}
			
			else {
				JOptionPane.showMessageDialog(null, "This entry does not exist");
			}

		}
		
		if (e.getSource() == viewList) {
			
			String message = "";
			for (Integer i : hm.keySet()) {
				
				message += "ID: " + i + " Name: " + hm.get(i) + "\n";
				
			}
			
			JOptionPane.showMessageDialog(null, message);

		}
		
		if (e.getSource() == removeEntry) {
			
			String removeID = JOptionPane.showInputDialog("Type an ID number you would like to remove" );
			int IDremoved = Integer.parseInt(removeID);
			if (hm.containsKey(IDremoved)) {
				
				hm.remove(IDremoved);
				
			}
			else {
				JOptionPane.showMessageDialog(null, "This ID number does not exist");
			}
			
		}

	}

	public static void main(String[] args) {

		LogSearch ls = new LogSearch();
		ls.GUI();
	}

	// /*
	// * Crate a HashMap of Integers for the keys and Strings for the values.
	// *
	// * Create a GUI with three buttons.
	// * Button 1: Add Entry
	// * When this button is clicked, use an input dialog to ask the user to enter
	// an ID number.
	// * After an ID is entered, use another input dialog to ask the user to enter a
	// name.
	// * Add this information as a new entry to your HashMap.
	// *
	// * Button 2: Search by ID
	// * When this button is clicked, use an input dialog to ask the user to enter
	// an ID number.
	// * If that ID exists, display that name to the user.
	// * Otherwise, tell the user that that entry does not exist.
	// *
	// * Button 3: View List
	// * When this button is clicked, display the entire list in a message dialog in
	// the following format:
	// * ID: 123 Name: Harry Howard
	// * ID: 245 Name: Polly Powers
	// * ID: 433 Name: Oliver Ortega
	// * etc...
	// *
	// * When this is complete, add a fourth button to your window.
	// * Button 4: Remove Entry
	// * When this button is clicked, prompt the user to enter an ID using an input
	// dialog.
	// * If this ID exists in the HashMap, remove it. Otherwise, notify the user
	// that the ID
	// * is not in the list.
	// *
	// * */
	//

}

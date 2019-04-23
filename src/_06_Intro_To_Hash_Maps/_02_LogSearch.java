package _06_Intro_To_Hash_Maps;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class _02_LogSearch implements ActionListener {
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

	HashMap<Integer, String> newHashMap = new HashMap<Integer, String>();

	JFrame frame;
	JPanel panel;
	JButton button1;
	JButton button2;
	JButton button3;

	void gui() {

		frame = new JFrame();
		panel = new JPanel();
		frame.add(panel);
		button1 = new JButton("Add Entry");
		button1.addActionListener(this);
		button2 = new JButton("Search by ID");
		button2.addActionListener(this);
		button3 = new JButton("View List");
		button3.addActionListener(this);
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		frame.setVisible(true);
		frame.pack();

	}

	public static void main(String[] args) {

		_02_LogSearch ls = new _02_LogSearch();
		ls.gui();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		if (e.getSource() == button1) {

			String IDNumber = JOptionPane.showInputDialog("Please enter an ID number...");
			int idNumber = Integer.parseInt(IDNumber);
			String name = JOptionPane.showInputDialog("Please enter a name...");
			newHashMap.put(idNumber, name);
		}

		if (e.getSource() == button2) {

			String newIDNumber = JOptionPane.showInputDialog("Please enter an ID number...");
			int newidNumber = Integer.parseInt(newIDNumber);

			if (newHashMap.containsKey(newidNumber)) {

				JOptionPane.showMessageDialog(null, newHashMap.get(newidNumber));

			}

		}

		String output = "";

		if (e.getSource() == button3) {

			for (Integer i : newHashMap.keySet()) {

				output += newHashMap.get(i);

			}

			JOptionPane.showMessageDialog(null, "ID: " + idNumber + " Name: " + name);

		}

	}

}

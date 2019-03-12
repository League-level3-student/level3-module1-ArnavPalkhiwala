package _04_HangMan;

import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class HangMan {

	Stack<String> randomStack = new Stack<String>();

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JLabel label = new JLabel();

	void ask() {

		String wordNumber = JOptionPane.showInputDialog("Please give a number from 1 to 266...");
		int wordNum = Integer.parseInt(wordNumber);

		if (wordNum > 266) {

			JOptionPane.showMessageDialog(null, "Incorrect value");
			JOptionPane.showInputDialog("Please give a number from 1 to 266...");

		}

		for (int i = 0; i < wordNum; i++) {

			String random = Utilities.readRandomLineFromFile("dictionary.txt");
			randomStack.push(random);

		}

		String popped = randomStack.pop();
		String blanks = " ";

		for (int i = 0; i < popped.length(); i++) {
			blanks += "_ ";
		}

		frame.add(panel);
		panel.add(label);
		label.setText(blanks);
		System.out.println(popped);
		frame.setVisible(true);
		frame.pack();

		String s = JOptionPane.showInputDialog("Guess a letter");
		for (int i = 0; i < popped.length(); i++) {

			if ((popped.charAt(i) + "").equals(s)) {

				blanks = blanks.substring(0, i * 2) + s + blanks.substring(i * 2 + 1);
				System.out.println(blanks);
			}

		}
		label.setText(blanks);

	}

	public static void main(String[] args) {
		HangMan hm = new HangMan();
		hm.ask();
	}

}

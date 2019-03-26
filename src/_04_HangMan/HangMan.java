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

	int lives = 10;

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
//		System.out.println(popped);
		String blanks = " ";
		for (int i = 0; i < popped.length(); i++) {
			blanks += "_ ";
		}

		frame.add(panel);
		panel.add(label);
		label.setText(blanks);
		frame.setVisible(true);
		frame.pack();

		while (lives > 0) {

			boolean letterFound = false;

			String guess = JOptionPane.showInputDialog("Guess a letter");

			for (int j = 0; j < popped.length(); j++) {

				if ((popped.charAt(j) + "").equals(guess)) {

					blanks = blanks.substring(0, j * 2) + guess + " " + blanks.substring(j * 2 + 2, blanks.length());
					letterFound = true;
				}
			}

			if (letterFound == false) {

				lives -= 1;
				JOptionPane.showMessageDialog(null, "You lost a life... You now have " + lives + " lives");
			}

			String newString = blanks.replace(" ", "");

			if (newString.equals(popped)) {

				if (randomStack.isEmpty() == false) {
					JOptionPane.showMessageDialog(null, "Next word...");
					popped = randomStack.pop();
					System.out.println();
					blanks = "";
					for (int i = 0; i < popped.length(); i++) {
						blanks += "_ ";
					}
				}

				else {

					frame.dispose();
					JOptionPane.showMessageDialog(null, "Congrats! You finished all of you words!");
				}
			}

			if (lives == 0) {
				JOptionPane.showMessageDialog(null, "Game over...The words was " + popped);
			}

			label.setText(blanks);
		}
	}

	public static void main(String[] args) {
		HangMan hm = new HangMan();
		hm.ask();
	}

}

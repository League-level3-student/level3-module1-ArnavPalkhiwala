package _04_HangMan;

import javax.swing.JOptionPane;

public class HangMan {

	void ask() {

		String wordNumber = JOptionPane.showInputDialog("Please give a number from 1 to 266...");
		int wordNum = Integer.parseInt(wordNumber);
		dictionary.text();
	}

}

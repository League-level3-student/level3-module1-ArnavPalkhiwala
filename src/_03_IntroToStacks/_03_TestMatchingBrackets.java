package _03_IntroToStacks;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Stack;

import org.junit.Test;

public class _03_TestMatchingBrackets {

	@Test
	public void testMatchingBrackets() {
		assertTrue(doBracketsMatch("{}"));
		assertTrue(doBracketsMatch("{{}}"));
		assertTrue(doBracketsMatch("{}{}{{}}"));
		assertFalse(doBracketsMatch("{{}"));
		assertFalse(doBracketsMatch("}{"));
	}

	Stack<Character> stack = new Stack<Character>();

	// USE A STACK TO COMPLETE THE METHOD FOR CHECKING IF EVERY OPENING BRACKET HAS
	// A MATCHING CLOSING BRACKET

	Stack<Character> check = new Stack<Character>();
	
	

	private boolean doBracketsMatch(String b) {

		for (int i = 0; i < b.length(); i++) {

			char c = b.charAt(i);
			if (c == '{') {

				check.push(c);

			}

			else {

				if (check.size() == 0) {

					return false;

				}

				else {
					check.pop();

				}
			}

		}

		if (check.size() != 0) {
			return false;
		}

		else {
			return true;

		}

	}

}
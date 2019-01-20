package _01_IntroToArrayLists;

import java.util.ArrayList;

public class _01_IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		//   Don't forget to import the ArrayList class
		
		ArrayList <String> listOfStrings = new ArrayList<String>(); 

		//2. Add five Strings to your list
		
		listOfStrings.add("Hello");
		listOfStrings.add("Hi");
		listOfStrings.add("Goodbye");
		listOfStrings.add("Bye");
		listOfStrings.add("See you Later");
		
		//3. Print all the Strings using a standard for-loop
		
		for (int i = 0; i < listOfStrings.size(); i++) {
			
			String word = listOfStrings.get(i);
			System.out.println(word);
			
		}
		
		
		//4. Print all the Strings using a for-each loop
		
		 for (String string : listOfStrings) {
			 
			 System.out.println(string);
			
		}
		
		//5. Print only the even numbered elements in the list.
		 
		 for (int i = 0; i < listOfStrings.size(); i+=2) {
			System.out.println(listOfStrings.get(i));
		}
		
		//6. Print all the Strings in reverse order.
		 
		 for (int i = listOfStrings.size()-1; i >= 0; i--) {
				System.out.println(listOfStrings.get(i));
			}
		
		//7. Print only the Strings that have the letter 'e' in them.
		 
		 for (int i = 0; i < listOfStrings.size(); i++) {
			 
			 if (listOfStrings.get(i).contains("e")) {
				 
				 System.out.println(listOfStrings.get(i));
				
			}
			
		}
	}
}

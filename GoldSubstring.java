package com.bharath.javaprograms.substring;

import java.util.Scanner;

public class GoldSubstring {

		public static void main(String[] args) {
			
//			we will create a scanner to point to System.in so we can receive user input; We are assigning it to a local variable named Scanner 
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter a String");
			
//			We will use .nextLine() to advance the 's' string scanner to the next line
			String GoldString = scanner.nextLine();
			String FindWord = "gold";
			boolean found = false;
			
//			To avoid casing issues we will first convert the entire string into lowercase
			GoldString = GoldString.toLowerCase();
			
//			We will use a for loop to search the length of the string that contains the substring 'gold'
			for (int i = 0; i < GoldString.length(); i++) {
//				We will define that 'k' is equal to 'i'
//				Each time 'i' is incremented we will use 'k' to hold on to that increment and then search the next 4 characters
				int k = i, j = 0;
				
//				We will use a second for loop to iterate through each character to find the substring 'gold'
//				As the 'i' value is incremented an the cursor moves, we are using 'k' inside this inner loop along with
//				'j' to find if the letter 'g' occurs, then if the letter 'o' occurs and so on; If there is a match that means 'gold' is found
				for(j = 0; j < FindWord.length(); j++) {
					

//					If the character in the index being searched does not equal the characters of substring 'gold', break loop, no gold found.
					if (GoldString.charAt(k)!= FindWord.charAt(j)) {
						break;
					}
//					If one character is a match we will initialize 'k' to hold on to that and continue iterating through each character to find the entire substring
					k++;
				}
//				If the substring 'gold' is found, break loop, gold found.
				if (j == FindWord.length()) {
					found = true;
					break;
				}
			}
//			If the boolean 'found' is true gold print has been found, else no gold was found
			if(found) {
				System.out.println("Gold has been found");
			} else {
				System.out.println("No Gold found");
			}

	}

}

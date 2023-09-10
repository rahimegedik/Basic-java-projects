package firstproject;

import java.util.Scanner;

public class Palinrome2 {

	public static void main(String[] args) {
		String original , reverse= "";
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter a string: ");
		original = scan.nextLine();
		reverse = original.replaceAll("\\s+","");
		
		int first = 0;
		int last = reverse.length()-1;
		
		boolean palindrome=true;
		
		while (first<=last) {
			if (reverse.charAt(first)!=reverse.charAt(last)) {
				palindrome=false;
				break;
				}
			first++;
		    last--;
		    }
		if (palindrome)
			System.out.println("The string is a palinrome.");
		else 
			System.out.println("The string isn't a palindrome.");
		}

}

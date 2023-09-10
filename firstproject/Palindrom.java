package firstproject;

import java.util.Scanner;

public class Palindrom {

	public static void main(String[] args) {
		String original , reverse= "";
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter a string: ");
		original = scan.nextLine();
		
		int length = original.length();
		
		for (int i = length-1; i>=0; i--) 
			reverse = reverse + original.charAt(i);
		
		if (original.equals(reverse))
			System.out.println("The string is a palinrome.");
		else 
			System.out.println("The string isn't a palindrome.");
		}
		 
	}

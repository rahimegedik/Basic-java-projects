package firstproject;

import java.util.Scanner;

public class ReverseStrings {

	public static void main(String[] args) {
		
		System.out.println("Enter string to reverse: ");
		Scanner scan = new Scanner (System.in);
		String line = scan.nextLine();
		String reverse = "";
		 for (int i = line.length()-1; i>=0; i--) {
			 reverse = reverse + line.charAt(i);
		 }
		 System.out.println(line + " " + reverse);
		
	}

}

package newProject;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Plaindrome olduðunu düþündüðünüz bir sayý girin");
		Scanner girdi = new Scanner(System.in);
		String kelime = girdi.nextLine();
		String boþ = "";
		for (int i = kelime.length() - 1; i >= 0; i--) {
			boþ += kelime.charAt(i);
		}
		if (boþ.equals(kelime)) {
			System.out.println("palindrome kelime");
		} else {
			System.out.println("palindrome deðil");
		}

	}

}

package newProject;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Plaindrome oldu�unu d���nd���n�z bir say� girin");
		Scanner girdi = new Scanner(System.in);
		String kelime = girdi.nextLine();
		String bo� = "";
		for (int i = kelime.length() - 1; i >= 0; i--) {
			bo� += kelime.charAt(i);
		}
		if (bo�.equals(kelime)) {
			System.out.println("palindrome kelime");
		} else {
			System.out.println("palindrome de�il");
		}

	}

}

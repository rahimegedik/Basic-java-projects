package newProject;

import java.util.Scanner;

public class RemoveCharacter {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter a string: ");
		String str = scan.nextLine();
		String str1 = str.toLowerCase();

		System.out.println("Enter a chracter to remove: ");
		String l = scan.nextLine();
		String l1 = l.toLowerCase();

		remove(str1, l1);

	}

	public static void remove(String str1, String l1) {

		String newStr = str1.replaceAll(l1, "");
		System.out.println(newStr);

	}
}

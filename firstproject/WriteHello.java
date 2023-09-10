package firstproject;

import java.util.Scanner;

public class WriteHello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter your name:");
		Scanner scan = new Scanner (System.in);
		String name = scan.nextLine();
		
		System.out.println("Hello " + name + " !");
	}

}

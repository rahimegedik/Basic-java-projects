package firstproject;

import java.util.Scanner;

public class FinfHypot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number:");
		double number = scan.nextDouble();
		
		System.out.println(number +  Math.hypot(number, number));
		System.out.println(number +  Math.hypot(number, number));
		System.out.println(number +  Math.hypot(number, number));
		

	}

}

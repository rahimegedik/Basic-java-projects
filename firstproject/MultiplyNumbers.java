package firstproject;

import java.util.Scanner;

public class MultiplyNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Enter first number:");
		double firstNumber = scan.nextDouble();

		System.out.println("Enter second number:");
		double secondNumber = scan.nextDouble();
		
		System.out.println(firstNumber + "*" + secondNumber + "=" + firstNumber*secondNumber );
	}

}

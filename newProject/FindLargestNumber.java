package newProject;

import java.util.Scanner;

public class FindLargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Enter first number: ");
		int firstNumber = input.nextInt();
		
		System.out.println("Enter second number: ");
		int secondNumber = input.nextInt();
		
		System.out.println("Enter third number: ");
		int thirdNumber = input.nextInt();
		
		if 
		(firstNumber>secondNumber && firstNumber>thirdNumber)
			System.out.println("Largest number is " + firstNumber);
		
		else if 
		(secondNumber>firstNumber && secondNumber>thirdNumber)
			System.out.println("Largest number is " + secondNumber);
		
		else if 
		(thirdNumber>firstNumber && thirdNumber>secondNumber)
			System.out.println("Largest number is " + thirdNumber);
		
		}

}

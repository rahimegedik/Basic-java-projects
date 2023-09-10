package firstproject;

import java.util.Scanner;

public class CalculatePerimeterOfSquare{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter a number:");
		double a = input.nextDouble();
		double perimeter = 4*a;
		
		System.out.println("Perimeter of square:" + perimeter);
		
		
		}

}

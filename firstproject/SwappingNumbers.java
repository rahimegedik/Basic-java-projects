package firstproject;

import java.util.Scanner;

public class SwappingNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner (System.in);
		System.out.println("Enter first number:");
		int x = input.nextInt();
	    System.out.println("Enter second number:");
	    int y = input.nextInt();
	    
	    System.out.println("Before swapping numbers: " + x + " " + y);
	    
	    int z = x;
	    x = y;
	    y = z;
	    
	    System.out.println("After swapping: " + x + " " + y);
	    
	 
	    }

}

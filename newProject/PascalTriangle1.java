package newProject;

import java.util.Scanner;

public class PascalTriangle1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter number of rows of Pascal's triangle: ");
		int rows = scan.nextInt();
		
	    System.out.println("Pascal triangle is: ");
        PascalTriangle(rows);

	}
	    public static void PascalTriangle(int rows) {
	    	 for (int i = 0; i < rows; i++) {
	                int number = 1;
	                System.out.printf("%" + (rows - i) * 2 + "s", "");
	                for (int j = 0; j <= i; j++) {
	                    System.out.printf("%4d", number);
	                    number = number * (i - j) / (j + 1);
	                }
	                System.out.println();
	    	 }
	    }
	    
}

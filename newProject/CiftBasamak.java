package newProject;

import java.util.Scanner;

public class CiftBasamak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		System.out.println("enter a number: ");
		int n = scan.nextInt();
		
		System.out.println(cift(n));
	

				
	}
	public static int cift (int n) {

		if (n/2==0) {
			int count = 0;
			count ++ ;
			}
		return cift (n%10);
		
		
			
	}
	

}

package firstproject;

import java.util.Scanner;

public class CalculateHour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out .println("Enter seconds:");
		int seconds = scan.nextInt();
		
		int p1 = seconds % 60;
		int p2 = seconds / 60;
		int p3 = p2 % 60;
		p2 = p2 / 60;
		
		System.out.println(p2 + ":" + p3 + ":" + p1);
		
		
		
		}

}

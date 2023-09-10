package newProject;

import java.util.*;

public class WriteNumberAsAString {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter the number (3-digit number): ");
		int num = scan.nextInt();
		
		if (num<100 || num>999 )
			System.out.println("Wrong input");
		else
		{ 
			int digit1=num%10;
			num = num/10;
			int digit2=num%10;
			num = num/10;
			int digit3=num%10;
			
			
		switch (digit3)
		{
		case 1: System.out.print("yüz ");break;
		case 2: System.out.print("iki yüz "); break;
		case 3: System.out.print("üç yüz "); break;
		case 4: System.out.print("dört yüz "); break;
		case 5: System.out.print("beþ yüz "); break;
		case 6: System.out.print("altý yüz "); break;
		case 7: System.out.print("yedi yüz "); break;
		case 8: System.out.print("sekiz yüz "); break;
		case 9: System.out.print("dokuz yüz"); break;
		}
		switch (digit2)
		{
		case 1: System.out.print("on ");break;
		case 2: System.out.print("yirmi "); break;
		case 3: System.out.print("otuz "); break;
		case 4: System.out.print("kýrk "); break;
		case 5: System.out.print("elli "); break;
		case 6: System.out.print("altmýþ "); break;
		case 7: System.out.print("yetmiþ "); break;
		case 8: System.out.print("seksen "); break;
		case 9: System.out.print("doksan "); break;
		case 0: System.out.print(" "); break;
		}
		switch (digit1)
		{
		case 1: System.out.print("bir ");break;
		case 2: System.out.print("iki "); break;
		case 3: System.out.print("üç "); break;
		case 4: System.out.print("dört "); break;
		case 5: System.out.print("beþ "); break;
		case 6: System.out.print("altý "); break;
		case 7: System.out.print("yedi "); break;
		case 8: System.out.print("sekiz "); break;
		case 9: System.out.print("dokuz "); break;
		case 0: System.out.print(""); break;
		}
		
		}

	}

}

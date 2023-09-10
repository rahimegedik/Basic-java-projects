package newProject;

import java.util.Scanner;

public class HelloName {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter your name:");
		
		if (scan.hasNextInt())
		{ String name = scan.next();
			System.out.println("invalid data");
		}
		else if (scan.hasNextDouble())
		{ String name = scan.next();
			System.out.println("invalid data");
		}
		else if (scan.hasNextFloat())
		{ String name = scan.next();
			System.out.println("invalid data");
		}
		else if (scan.hasNextLine()) 
		{ String name = scan.next();
			System.out.println("Hello " + name );
		}	
	}
}
		
	
		
	
		
		
		
		

	



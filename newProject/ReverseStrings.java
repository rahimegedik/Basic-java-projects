package newProject;

import java.util.Scanner;

public class ReverseStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("reverse yapmak istedi�in kelimeyi gir"); 
		Scanner girdi=new Scanner(System.in); 
		String kelime=girdi.next(); 
		String bo�=""; 
		for(int i =kelime.length()-1;i>=0;i--){ 
		bo�+=kelime.charAt(i); 
		} 
		System.out.println(bo�); 

	}

}

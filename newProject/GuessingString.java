package newProject;

import java.util.Scanner;

public class GuessingString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			Scanner girdi = new Scanner(System.in); 
			 
			System.out.println("l�tfen bir kelime girin: "); 
			String kelime = girdi.next(); 
			 
			int sayac = 5; // maximum girdi value 
			int uzunluk = kelime.length(); 
			String g�r�nenkelime = ""; 
			 
			for (int n = 0; n < uzunluk; n++) 
			g�r�nenkelime += '_'; 
			 
			while (sayac > 0) { 
			 
			System.out.println("\nl�tfen bir harf tahmin edin: "); 
			char tahmin = girdi.next().charAt(0); 
			int pozisyon = kelime.indexOf(tahmin); 
			 
			for (; pozisyon >= 0; pozisyon = kelime.indexOf(tahmin, pozisyon + 1)) 
			g�r�nenkelime = g�r�nenkelime.substring(0, pozisyon) + tahmin + g�r�nenkelime.substring(pozisyon + 1
			); 
			 
			System.out.print(g�r�nenkelime + " tahmin hakk�n�z kald�: " + sayac); 
			sayac--; 
			 
			if(g�r�nenkelime.equals(kelime)) { 
			System.out.println("\nkazand�n"); 
			break; 
			} 
			} 
			 
			if (!g�r�nenkelime.equals(kelime)) System.out.println("\nkaybettin"); 

	}

}

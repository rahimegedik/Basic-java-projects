package newProject;

import java.util.Scanner;

public class GuessingString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			Scanner girdi = new Scanner(System.in); 
			 
			System.out.println("lütfen bir kelime girin: "); 
			String kelime = girdi.next(); 
			 
			int sayac = 5; // maximum girdi value 
			int uzunluk = kelime.length(); 
			String görünenkelime = ""; 
			 
			for (int n = 0; n < uzunluk; n++) 
			görünenkelime += '_'; 
			 
			while (sayac > 0) { 
			 
			System.out.println("\nlütfen bir harf tahmin edin: "); 
			char tahmin = girdi.next().charAt(0); 
			int pozisyon = kelime.indexOf(tahmin); 
			 
			for (; pozisyon >= 0; pozisyon = kelime.indexOf(tahmin, pozisyon + 1)) 
			görünenkelime = görünenkelime.substring(0, pozisyon) + tahmin + görünenkelime.substring(pozisyon + 1
			); 
			 
			System.out.print(görünenkelime + " tahmin hakkýnýz kaldý: " + sayac); 
			sayac--; 
			 
			if(görünenkelime.equals(kelime)) { 
			System.out.println("\nkazandýn"); 
			break; 
			} 
			} 
			 
			if (!görünenkelime.equals(kelime)) System.out.println("\nkaybettin"); 

	}

}

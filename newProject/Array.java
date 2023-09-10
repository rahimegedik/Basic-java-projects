package newProject;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = new int [100];
		
		array [0] = 1;
		
		for (int i = 0; i<array.length; i++) {
			array[i]=(i*2)+3;
			
		}
		for (int i=0; i<array.length; i++) {
			System.out.println(array[i]);
		}
		System.out.println(array[26]);
		

	}

}

package newProject;

public class MaximizingEarning {

	public static void main(String[] args) {
		
		int dailyPrice = 0 ;
	    earn (dailyPrice);
		
		}
	
	public static int earn (int dailyPrice) {
		
	    int price1 = 50;
		int price2 = 200;
		int demand1 = 0;
		int demand2 = 750;
		
		for (int i=50; i<=200; i++) {	
		
		int slope = (demand2-demand1)/(price1-price2);
		int earn = (-slope)*(price2-i)*i;
		
		System.out.println("In case of rent price: " + i + " demand: " + earn/i + " total earning: " + earn);
		
		}
		return dailyPrice;
	}
	 
}


		
	



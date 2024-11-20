package mile_to_kilo;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter Miles");
		int miles = scanner.nextInt();
		
		double km = convertToKm(miles);
		
		System.out.println("Kilometer is "+ km);
		
	}
	
	public static double convertToKm(int miles) {
		
		 double result = miles * 1.6;
		 
		 return result;
			
	}	

}

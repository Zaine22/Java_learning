package guessMyNum;

import java.util.Scanner;

public class App {
	
	public static void main(String[] args) {
		System.out.println("Guess My Number");
		
		int secret = 35;
		Scanner scanner = new Scanner(System.in);
		
		 int guess = scanner.nextInt();
		
		while(guess != secret) {
			System.out.println("Wrong");
			guess = scanner.nextInt();
		}
	System.out.println("correct");
	
	
	
	}
}

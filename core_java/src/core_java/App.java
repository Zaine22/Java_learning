package core_java;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter Your Name:");
		String line = scanner.nextLine();
		
		System.out.println("Welcome "+ line);

	}

}

package random;
import java.util.Scanner;
public class App {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Your Name");
		String name = scanner.nextLine();
		
		System.out.println("Hello" + name);
		
		System.out.println("Enter your age");
		String ageIn = scanner.nextLine();
		
		int age = Integer.parseInt(ageIn);
		
		if(age < 18 ) {
			System.out.println("you are not an adult");
		}else {
			System.out.println("You are an adult");
		}
	}

}

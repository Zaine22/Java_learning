package demo1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		
		File file = new File("/Users/zaine/Desktop/hello.rtf");
		try {
			Scanner sc = new Scanner(file);
			
			String line1 = sc.nextLine();
			System.out.println(line1);
			System.out.println("File exits");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("File no found");
			e.printStackTrace();
		}
	}

}

package demo2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		File file = new File("/Users/zaine/Desktop/hell2o.rtf");
		
		try {
			readFile(file);
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
			e.printStackTrace();
		}
		
		System.out.println("Continue to program");

	}
	
	public static void readFile(File file) throws FileNotFoundException {
		Scanner sc = new Scanner(file);
		System.out.println("File Exits");
		
		

	}

}

package throwException;

import java.io.File;
import java.io.FileNotFoundException;

public class App {

	public static void main(String[] args) {
		File file = new File("/Users/zaine/Desktop/hello.rtf");
		
		MyReader reader = new MyReader();
		
		try {
			reader.read(file);
		} catch (FileNotFoundException e) {
			System.out.println("file not found exception");
				e.printStackTrace();
		}catch (ClassNotFoundException e) {
			System.out.println("Class not found exception");
			e.printStackTrace();
	}
	}
}

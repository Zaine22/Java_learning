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
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

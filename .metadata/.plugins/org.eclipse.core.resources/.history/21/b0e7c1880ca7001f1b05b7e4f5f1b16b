package throwException;

import java.io.File;
import java.io.FileNotFoundException;

public class MyReader {

	public void read(File file) throws FileNotFoundException{
		
		if(file.exists()) {
			System.out.println("File exist");
		} else {
			FileNotFoundException ex = new FileNotFoundException("File Ma shi br");
			throw ex;
		}
	}
}

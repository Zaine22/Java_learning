package throwException;

import java.io.File;
import java.io.FileNotFoundException;

public class MyReader {

	public void read(File file) throws FileNotFoundException, ClassNotFoundException{
		int errorCode = 1;
		
		if(errorCode==1) {
			 FileNotFoundException ex = new FileNotFoundException("File Ma Shi Pr");
			 throw ex;
		}
		if(errorCode==2) {
			 ClassNotFoundException ex = new ClassNotFoundException("Class Ma Shi Pr");
			 throw ex;
		}
		
		System.out.println("Continue Processing...");
	}
}

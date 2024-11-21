package input;

import javax.xml.crypto.Data;
import java.io.*;

//Apple , banana <- Datainputstream<-Bufferinputstream<-Fileinputstream<- {Data Source}
public class App {

    public static void main(String[] args) throws IOException {
        DataInputStream in = null;

        try {
            in = new DataInputStream(new BufferedInputStream(new FileInputStream("/Users/zaine/Desktop/mydata")));

            System.out.println(in.readUTF());
            System.out.println(in.readUTF());
            System.out.println(in.readInt());
            System.out.println(in.readInt());

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }finally {
            if(in != null){
                in.close();
            }
        }
    }
}

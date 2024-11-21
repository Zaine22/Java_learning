package output;

import java.io.*;
//Dataoutputstream->Bufferoutputstream->Fileoutputstream-> {Data Source}
public class App {
    public static void main(String[] args) throws IOException {
        //apple,banana,500,800

        try (DataOutputStream out = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("/Users/zaine/Desktop/mydata")))) {

            out.writeUTF("Apple");
            out.writeUTF("Banana");
            out.writeInt(500);
            out.writeInt(800);

            System.out.println("Finished");

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}

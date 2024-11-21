package input;


import java.io.*;

public class DateApp {
    public static void main(String[] args) throws IOException {
        DataInputStream in = null;

        try {
            in = new DataInputStream(new BufferedInputStream(new FileInputStream("/Users/zaine/Desktop/dataApp")));
           try {
               while(true){
                String name = in.readUTF();
                int price = in.readInt();
                   System.out.println(name + price);
               }
           } catch (EOFException e) {

           }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }finally {
            if(in !=null){
                in.close();
            }
        }
    }
}

import java.io.*;

public class App {
    public static void main(String[] args) throws IOException {

        File source = new File("/Users/zaine/Desktop/hello.rtf");
        File target = new File("/Users/zaine/Desktop/note.rtf");
        FileInputStream fs = null;
        FileOutputStream fo = null;
        try {
             fs = new FileInputStream(source);
            fo =  new FileOutputStream(target);

           int code ;
           System.out.println(fs.read());
           while ((code = fs.read()) != -1){
               fo.write(code);
           }



        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            if(fs!=null){
                fs.close();
            }

            if (fo != null) {
                fo.close();
            }
        }
    }
}
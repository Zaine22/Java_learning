package output;

import java.io.*;

public class DateApp {
    public static void main(String[] args) {
        String [] products = {"Java T-shirt", "KeyChain", "Mug"};
        int [] prices = {10000,5000,3000};


        try (DataOutputStream out = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("/Users/zaine/Desktop/dataApp")))) {

            out.writeUTF("Apple");
            out.writeUTF("Banana");
            out.writeInt(500);
            out.writeInt(800);
            for (int i = 0; i < products.length; i++) {
                out.writeUTF(products[i]);
                out.writeInt(prices[i]);
            }

            System.out.println("Finished");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

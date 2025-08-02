package DAY12;

import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile2 {
    public static void main(String[] args) {
       
        String content = "Hello, this is the content I want to write into the file!";

        try {
            
            FileWriter writer = new FileWriter("C:\\Users\\Dineesha\\Downloads\\sa.txt");

         
            writer.write(content);

           
            writer.close();

            System.out.println(" File written successfully!");
        } catch (IOException e) {
            System.out.println(" An error occurred.");
            e.printStackTrace();
        }
    }
}

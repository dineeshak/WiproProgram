package DAY12;


import java.io.FileWriter;
import java.io.IOException;

public class FileWriter_Example{
    public static void main(String[] args) throws IOException {
        String content = "This is text written to file";

        // File path - make sure this is valid for your system
        FileWriter writer1 = new FileWriter("C:\\Users\\Dineesha\\Downloads\\sample.txt");
        writer1.write(content);
        writer1.close();

        System.out.println("Written successfully!");
    }
}
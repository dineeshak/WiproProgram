package DAY11;


import java.io.IOException;
import java.io.FileWriter;

public class WriteToFile {

    public static void main(String[] args) {
        try {
            // Create a FileWriter object to write data to the file
            FileWriter writer = new FileWriter("C:\\Users\\Dineesha\\Downloads\\samp.txt");

            // Write some data to the file
            writer.write("Hello, I am trying to find testing tools for ITC project\\n");
            writer.write("tools like automation and performance tools\\n");

            // Close the file writer
            writer.close();

            System.out.println("Data written to file successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
    }
}
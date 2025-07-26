package DAY7;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class XMLFile {
    public static void main(String[] args) {
        File xmlFile = new File("C:\\Users\\Dineesha\\Downloads\\sample.xml");

        try {
            BufferedReader br = new BufferedReader(new FileReader(xmlFile));
            String line = br.readLine();

            while (line != null) {
                System.out.println("File Content: " + line);
                line = br.readLine();
            }

            br.close();
        } 
        catch (FileNotFoundException e) {
            System.out.println("File not found error: " + e.getMessage());
        }
        catch (IOException e) {
            System.out.println("IO error occurred while reading the file: " + e.getMessage());
        }
        finally {
            System.out.println(" This is the complete execution.");
        }
    }
}

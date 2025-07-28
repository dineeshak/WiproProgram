package DAY7;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CSVFile {
    public static void main(String[] args) {
        File csvFile = new File("C:\\Users\\Dineesha\\Downloads\\sample.csv");

        try {
            BufferedReader br2 = new BufferedReader(new FileReader(csvFile));
            String line = br2.readLine();
            while(line!=null) {
		    	System.out.println("File Content "+line);
		    	line=br2.readLine();
            }

            br2.close();
        }
        catch (FileNotFoundException e) {
            System.out.println(" File not found error: " + e.getMessage());
        }
        catch (IOException e) {
            System.out.println("IO error occurred while reading the CSV file: " + e.getMessage());
        }
        finally {
            System.out.println("Finally block: CSV file reading complete.");
        }
    }
}

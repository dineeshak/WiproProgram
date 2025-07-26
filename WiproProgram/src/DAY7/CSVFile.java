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
            BufferedReader br = new BufferedReader(new FileReader(csvFile));
            String line = br.readLine();

            while (line != null) {
                // Split each line by comma
                String[] fields = line.split(",");
                
                // Print each field
                System.out.print("CSV Line: ");
                for (String field : fields) {
                    System.out.print(field + " ");
                }
                System.out.println(); // new line

                // Read next line
                line = br.readLine();
            }

            br.close();
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

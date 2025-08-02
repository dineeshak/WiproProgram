package DAY12;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferWriter {
	public static void main(String[] args) throws IOException {
		BufferedWriter br=new BufferedWriter(new FileWriter("C:\\Users\\Dineesha\\Downloads\\sample.txt",true));
		{
			br.write("This is written using FileWriter");
			//br.newLine();
			br.close();
			System.out.println("Written Successfully");
		}
		
	}

}
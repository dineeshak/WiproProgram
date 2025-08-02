package DAY12;


import java.io.FileReader;
import java.io.IOException;
public class ReadaFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileReader reader=new FileReader("C:\\Users\\Dineesha\\Downloads\\sample.txt");
		int ch;
		while((ch=reader.read())!=-1)
		{
			System.out.println((char) ch);
		}
		
	
	}	
	}
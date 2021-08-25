package fileinputoutputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


public class ReadFile {

	public static void main(String[] args) throws IOException {

		FileInputStream fis=null;
		
		try {
			fis = new FileInputStream("C:\\Downloaded Programs\\abc.txt");  
			int k;
			while ((k=fis.read()) != -1) {
				System.out.println((char)k);
			}
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}finally {
			fis.close();
		}
		
		
	}

}

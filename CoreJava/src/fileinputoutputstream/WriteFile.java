package fileinputoutputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteFile {

	public static void main(String[] args) throws IOException {

		FileOutputStream fos=null;
		
		try {
			fos = new FileOutputStream("C:\\Downloaded Programs\\abc.txt");
			
			String s = "banglore to pune";
			byte b[] = s.getBytes();
			fos.write(b);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}finally {
			fos.close();
		}

	}

}

package fileinputoutputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadFileIntoString {

	public static void main(String[] args) throws IOException {

		FileInputStream fis=null;
		
		try {
			char ch[] = new char[25];	//extra step 1 for converting file content into string
			fis = new FileInputStream("C:\\Downloaded Programs\\abc.txt");  
			int k, i=0;                         //extra step 2
			while ((k=fis.read()) != -1) {
				ch[i++] = (char)k;				//extra step 3
				System.out.println((char)k);
			}	//use counter if file content is big
			
			String s = new String(ch);				//extra step 4
			System.out.println("String: " + s);		//extra step 5
			System.out.println(s.toUpperCase());
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}finally {
			fis.close();
		}
		
		
	}

}

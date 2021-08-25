package serilization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Destination {

	public static void main(String[] args) {

		FileInputStream fis = null;
		ObjectInputStream ois = null;
		Object obj=null;

		try {
			fis = new FileInputStream("pqr.txt");
			ois = new ObjectInputStream(fis);
			obj = ois.readObject();

		}catch( ClassNotFoundException | IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(fis != null)
					fis.close();
				if(fis != null)
					ois.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		ArrayList<Student> al = (ArrayList<Student>)obj;
		for(Student s:al) {
			System.out.println(s);
		}

	}

}

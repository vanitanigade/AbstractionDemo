package serilization.egwithinheritance;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class DeserilizationDemo {

	void readFromFile(String filename){
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		ArrayList al = null;
		try {
			fis = new FileInputStream(filename);
			ois = new ObjectInputStream(fis);
			Object obj = ois.readObject();
			al = (ArrayList) obj;
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}finally {
			try {
				if(fis != null)
					fis.close();
				if(ois != null)
					ois.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

			for(Object objt : al) {
				System.out.println(objt);
			}

		}

	}
}

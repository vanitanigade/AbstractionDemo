package serilization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Source {

	public static void main(String[] args) {

		Student s1 = new Student(11, "abhi", "BE", 1.5f);
		Student s2 = new Student(12, "kriti", "BE", 2.5f);
		Student s3 = new Student(13, "sai", "BE", 3.5f);
		Student s4 = new Student(14, "raj", "BE", 4.5f);

		ArrayList<Student> stulist = new ArrayList<>();
		stulist.add(s1);
		stulist.add(s2);
		stulist.add(s3);
		stulist.add(s4);

		FileOutputStream fos= null;
		ObjectOutputStream oos = null;
		try {
			fos = new FileOutputStream("pqr.txt");
			oos = new ObjectOutputStream(fos);
			oos.writeObject(stulist);

		}catch( IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(fos != null)
					fos.close();
				if(oos != null)
					oos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println("object is written on disc");

	}

}

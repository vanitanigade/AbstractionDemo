package reflection.dtclear;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Student_Main {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException,
			IllegalArgumentException, InvocationTargetException {

		Student s = new Student("Kapil", 23);
		Method privateMethod = Student.class.getDeclaredMethod("getAge"); // Create Method object
		privateMethod.setAccessible(true); // Set the accessibility as true
		int age = (int) privateMethod.invoke(s); // Store the returned value of private methods in variable

		System.out.println("Age of Student: " + age);

	}

}

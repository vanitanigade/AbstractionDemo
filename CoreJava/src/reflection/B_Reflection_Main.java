package reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class B_Reflection_Main {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {

		B b = new B();
		Method m = B.class.getMethod("m2", int.class);
		m.invoke(b, 90);
	}

}

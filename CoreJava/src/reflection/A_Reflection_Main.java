package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class A_Reflection_Main {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {

		//	Class cls = Class.forName("reflection.A");
		Class clsa = A.class;

		System.out.println("class name: " + clsa.getName());

		System.out.println("========Fields======");
		Field fields[]=clsa.getFields();
		for(Field f:fields) {
			System.out.println(f.getName());
		}

		System.out.println("=========Constructors==========");
		Constructor constructors[]=clsa.getConstructors();
		for(Constructor constr :constructors) {
			System.out.println(constr.getName());
			
			Parameter p[] = constr.getParameters();
			for(Parameter z:p) {
				System.out.println("Parameters: " + z.getType() + " " + z.getName());
			}
		}

		System.out.println("======Methods=====");
		Method methods[]=clsa.getMethods();
		for(Method m : methods) {
			System.out.println("Method return types: " + m.getReturnType() + "    Method names: " + m.getName());
		
			Parameter p[]=m.getParameters();
			for(Parameter ps : p) {
				System.out.println("Method parameter type: " + ps.getType() + "  Parameter names: " + ps.getName());
			}
		}

		System.out.println("===Invoking a method====");
		A obj1 = new A();
		A obj2 = (A) clsa.newInstance();  //OR new A();
		
		Class cls [] = new Class[0];	//0 parameters in method so 0
		Method m1 = clsa.getDeclaredMethod("m1", cls);
		Object arg[] = new Object[0];	//0 parameters in method so 0
		m1.invoke(obj1, arg);
		
		Class ParameterType[] = new Class[2];  //2 parameters in method so 2
		ParameterType[0] = java.lang.Integer.class;
		ParameterType[1] = java.lang.Integer.class;		//if public void m2(Integer a,Integer b,String c) then java.lang.String.class
		Method m2 = clsa.getDeclaredMethod("m2", ParameterType);
		
		Object obj[] = new Object[2];
		obj[0] = new Integer(45);
		obj[1] = new Integer(25);		//if String then obj[2] = new String("Hello");
		m2.invoke(obj2, obj);
		
		
	}

}

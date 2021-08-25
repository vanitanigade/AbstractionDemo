package finalize;

import staticPackage.Practice;

public class Finalize {

	public static void main(String[] args)     {

		Finalize obj1 = new Finalize();
		Finalize obj2 = new Finalize();
		obj1 = null;
		obj2 = null;						//if this is commented then finalize will run only once
		System.gc();
		System.out.println("Done");
	}

	@Override
	protected void finalize()			//gets called after garbage collector every time value passed into objects
	{
		System.out.println("Before Destory the Object perform some activity");
		System.out.println("Release connection");
		System.out.println("Close network connection");
	}

}

package onlinetests.datatypes;

public class Conversion {

	public static void main(String[] args) {

		 byte b;
	        int i = 258;
     double d = 325.59;

     b = (byte) i;
     System.out.print(" "+b);

     i = (int) d;
     System.out.print(" "+i);

         b = (byte) d;
     System.out.print(" "+b);  

	}

}

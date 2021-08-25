package string;

public class Buffer_Builder {

	public static void main(String[] args) {

		String s = new String("hello");
		String s1 = s.concat("java");
		System.out.println(s);					//immutable / cannot change
		System.out.println("==============");
		
		StringBuffer sbf = new StringBuffer("Pune");
		System.out.println(sbf.capacity());
		sbf.append("MumbaiDelhiBangalore");
		System.out.println(sbf);				//mutable / can be change
		System.out.println(sbf.capacity());
		System.out.println("===================");
		
		
		StringBuilder sbl = new StringBuilder("Mango");
		sbl.append("OrangeBanana");
		System.out.println(sbl);
		
		
	}

}

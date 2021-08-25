package exception.maam;

public class Custom_UserDefined_Main {

	public static void main(String[] args) {

		int a[] = {1,2};
		int x = a[0];
		int y = a[1];

		if(x==y)
			System.out.println("array has same elements");
		else
			try {

				throw new Custom_UserDefined("array has different elements");

			}catch(Custom_UserDefined e) {
				System.out.println("caught my exception");
				System.out.println(e.getMessage());

			}finally {
				System.out.println("finally block always executes");
			}

	}

}

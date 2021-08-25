package exception.custom;

public class Main {

	public static void main(String[] args) {
		
		SavingAccount sa = new SavingAccount(123, "Nisha", 10000);
		sa.withdraw(7000);
		System.out.println(sa);
		
	}

}

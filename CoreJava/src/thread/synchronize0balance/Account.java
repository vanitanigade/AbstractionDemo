package thread.synchronize0balance;

public class Account {

	int balance;

	synchronized void deposit(int amount) {
		balance = balance + amount;
		System.out.println("credited amount: " + balance);
	}

	synchronized void withdraw(int amount) {
		balance = balance -amount;
		System.out.println("debited amount: " + balance);
	}
}

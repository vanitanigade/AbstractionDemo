package thread.synchronize0balance;

public class JobB implements Runnable{

	Account account;

	JobB(Account account){
		this.account = account;
	}

	@Override
	public void run() {
		for(int i=0; i<=100000; i++) {
			account.withdraw(i);
		}
	}

}

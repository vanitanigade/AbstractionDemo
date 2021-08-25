package thread.synchronize0balance;

public class JobA implements Runnable{

	Account account;
	
	JobA(Account account){
		this.account = account;
	}
	
	@Override
	public void run() {
		for(int i=0; i<=100000; i++) {
			account.deposit(i);
		}
	}

}

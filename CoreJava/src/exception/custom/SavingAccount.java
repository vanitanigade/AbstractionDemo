package exception.custom;
import static exception.custom.Constants.*;

public class SavingAccount {
	int id;
	String name;
	double balance;
	
	public void withdraw(int amount) {
		try {
		if(this.balance - amount <= MIN_SAVING_ACC_BAL)
			throw new InsufficientBalanceException();
			this.balance = this.balance - amount;
		}catch(InsufficientBalanceException e) {
			e.printStackTrace();
		}
	}
	
	public SavingAccount(int id, String name, double balance) {
		this.id = id;
		this.name = name;
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "SavingAccount [id=" + id + ", name=" + name + ", balance=" + balance + "]";
	}
	
	
	

}

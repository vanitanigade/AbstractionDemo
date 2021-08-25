package exception.custom;

import java.util.Arrays;

public class InsufficientBalanceException extends Exception{

	@Override
	public String toString() {
		return "Exception: Balance is not sufficient";
		}
	

}

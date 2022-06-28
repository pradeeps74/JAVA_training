package calculator;

public class InsufficientBalanceException extends Exception{
	int balance;
	public InsufficientBalanceException(int balance) {
		this.balance=balance;
	}
	public String showMessage() {
		return "Insufficient balance: "+balance;
		
	}

}
 class DepositLimitException extends Exception{
	 int amount;
	 public DepositLimitException(int amount) {
		 this.amount=amount;
	 }
	 public String ShowMessage() {
		 return "Your Deposit limit is only 40000 :  "+amount;
	 }
	
}

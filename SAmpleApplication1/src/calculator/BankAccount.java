package calculator;

import com.training.second.Transactions;

public class BankAccount implements Transactions {
	enum Status {
		ACTIVE(), INACTIVE();
	}

	int transactionDetails;
	long accountNumber;
	String name;
	String address;
	String accountType;
	int balance;
	int year = 12;

	public BankAccount() {
		accountNumber = 10085337775l;
		name = "Pradep";
		address = "B block , second floor, nesapakkam,K.k.nagar west,chennai-600078";
		accountType = "savings";
		balance = 77787;
		transactionDetails = 1;

	}

	public BankAccount(long accNum, String accName, String add, String accType, int bal) {
		this.accountNumber = accNum;
		this.name = accName;
		this.address = add;
		this.accountType = accType;
		this.balance = bal;
	}

	public void withdraw(int amount) throws InsufficientBalanceException {
	
		if (transactionDetails == 0) {
			System.out.println(Status.valueOf("INACTIVE"));
		} else {
			if (amount > balance) {
				throw new InsufficientBalanceException(amount);
			} else {
				balance = balance - amount;
				System.out.println("Withdraw amount is " + " " + amount);
				System.out.println("remaining balance" + balance);
				System.out.println(Status.valueOf("ACTIVE"));
			}
		}
	}

	public void deposit(int amount) throws DepositLimitException {
		if (transactionDetails < 0) {
			System.out.println(Status.valueOf("INACTIVE"));
		} else {
			if (amount >= 40000) {
				throw new DepositLimitException(amount);
			} else {
				balance = balance + amount;
				System.out.println("Deposit amount is " + " " + amount);
				System.out.println("Total balance" + balance);
				System.out.println(Status.valueOf("ACTIVE"));
			}
		}
	}

	@Override
	public void transactionDetails() {
		if (transactionDetails < 0) {

			System.out.println(Status.valueOf("INACTIVE"));

		} else {
			System.out.println("Accno:" + " " + accountNumber);
			System.out.println("Name:" + " " + name);
			System.out.println("Address:" + " " + address);
			System.out.println("AccountType:" + " " + accountType);
			System.out.println("balance:" + " " + balance);
			System.out.println(Status.valueOf("ACTIVE"));
		}

	}

}

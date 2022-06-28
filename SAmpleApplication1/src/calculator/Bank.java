package calculator;

import java.util.Scanner;

public class Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int amount;
		Scanner s1 = new Scanner(System.in);
		System.out.println("enter 1 for withdraw" + "\n " + "enter 2 for deposit" + "\n "
				+ "enter 3 for account details" + " \n" + "enter 4 for to quit");
		BankAccount b = new BankAccount();
		System.out.println("enter your choice");
		int press = s1.nextInt();
		switch (press) {
		case 1:
			System.out.println("Enter withdraw amount");
			try {
			amount = s1.nextInt();
			b.withdraw(amount);
			}
			catch(InsufficientBalanceException ib) {
				System.out.println(ib.showMessage());
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
			break;
		case 2:
			try {
			System.out.println("Enter deposit amount");
			amount = s1.nextInt();
			b.deposit(amount);
			}
			catch(DepositLimitException dl)
			{
				System.out.println(dl.ShowMessage());
			}
			catch(Exception e) {
				System.out.println(e);
			}
			break;
		case 3:
			b.transactionDetails();
			break;

		case 4:
			exit();
			break;
		default:
			System.out.println("Show Balance");
		}
		//BankAccount b1 = new BankAccount(1077785977l, "Deepan", "Sankagiri", "salary", 8757723l);
		// b1.display();
		
		s1.close();
		
	}

	private static void exit() {

	}

}

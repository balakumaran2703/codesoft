package task_3;

import java.util.Scanner;

public class ATM {
	static Scanner s = new Scanner(System.in);
	private BankAccount account;
	public ATM(BankAccount user) {
		this.account=user;
	}
	public static void main(String[] args) {
		double initial_balance=1000;
		BankAccount user=new BankAccount(initial_balance);
		ATM atm=new ATM(user);
		atm.atm_function();
	}
	public void atm_function() {
		System.out.println("Welcome to the ATM!\n");
		boolean repeat=true;
		do {
			System.out.println("Please Select following options");
	        System.out.println("1.Withdraw");
	        System.out.println("2.Deposit");
	        System.out.println("3.Check Balance");
	        System.out.println("4.Exit");
	        int option=s.nextInt();
	        if (option==1) {
				System.out.println("Enter the Amount to Withdraw");
				double withdraw=s.nextDouble();
				System.out.println(account.withdraw(withdraw));
			} else if (option==2) {
				System.out.println("Enter the Amount to Deposit");
				double deposit=s.nextDouble();
				System.out.println(account.deposit(deposit));
			}else if (option==3) {
				System.out.println(account.checkBalance());
			}else {
				System.out.println("Thank You for using this ATM!! Visit Again!!");
				repeat=false;
			}
	       
		} while (repeat);
	}
}

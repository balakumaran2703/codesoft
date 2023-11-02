package task_3;


class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        balance = initialBalance;
    }

    public String deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            return amount+" is Deposited from your Account\n Balance Amount is :"+balance;
        }
        return "Invalid Amount Entered!!";
    }

    public String withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            return amount+" is Deposited from your Account\n Balance Amount is :"+balance;
        }else if (amount<=0) {
			return "Invalid Number is Entered";
		}else {
			return "Insufficient Balance,Please Check the balance";
		}
    }

    public String checkBalance() {
        return "Account Balance is :"+balance;
    }
}

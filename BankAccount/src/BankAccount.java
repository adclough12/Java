import java.util.Random;

public class BankAccount {
	private double checkingBalance;
	private double savingsBalance;
	public static int numberOfAccounts = 0;
	public static double totalMoney = 0;
	private int accountNumber;
	
	private static int generateId() {
		Random randGenerator = new Random();
		int randomId = randGenerator.nextInt(10000000) + 999999999;
			return randomId;
	}
	
	public BankAccount() {
		BankAccount.numberOfAccounts += 1;
		this.checkingBalance = 0;
		this.savingsBalance = 0;
		this.accountNumber = BankAccount.generateId();
	}
	public double getCheckingBalance() {
		return this.checkingBalance;
	}
	public double getSavingsBalance() {
		return this.savingsBalance;
	}
	public int getAccountNumber() {
		return this.accountNumber;
	}
	public void moneyDeposit(double amount, String account) {
		if (account.equals("savings")) {
			this.savingsBalance += amount;
		}
		else if (account.equals("checking")) {
			this.checkingBalance += amount;
		}
		BankAccount.totalMoney += amount;
	}
	public void moneyWithdraw(double amount, String account) {
		boolean successful = false;
		if(account.equals("savings")) {
			if(this.savingsBalance - amount >= 0) {
				successful = true;
				this.savingsBalance -= amount;
			}
		}
		else if(account.equals("checking")) {
			if(this.checkingBalance - amount >= 0) {
				successful = true;
				this.checkingBalance -= amount;
			}
		}
		if(successful) {
			BankAccount.totalMoney -= amount;
		}
		else {
			System.out.println("Insufficient funds.");
		}
	}
	public void displayAccountBalance() {
		System.out.println(String.format("Savings: %.2f, Checking: %.2f", this.savingsBalance, this.checkingBalance));
	}
}

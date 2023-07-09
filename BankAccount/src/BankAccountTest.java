
public class BankAccountTest {

	public static void main(String[] args) {
		BankAccount ba1 = new BankAccount();
	System.out.println("New Acc No. - " + ba1.getAccountNumber());
		ba1.moneyDeposit(134.25, "checking");
		ba1.moneyDeposit(3.00, "savings");
		ba1.displayAccountBalance();
		
		System.out.println(BankAccount.totalMoney);
		
		ba1.moneyWithdraw(50, "checking");
		ba1.moneyWithdraw(80, "savings");
		ba1.displayAccountBalance();
		
		System.out.println(BankAccount.totalMoney);
		
	BankAccount ba2 = new BankAccount();
	System.out.println("New Acc No. - " + ba2.getAccountNumber());
		ba2.moneyDeposit(5, "checking");
		ba2.moneyDeposit(100, "savings");
		ba2.displayAccountBalance();
	ba2.moneyWithdraw(20, "checking");
	}

}

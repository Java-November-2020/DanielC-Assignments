import java.util.*;

public class BankAccount {

	public String accountNumber;
	public double checkingBalance;
	public double savingsBalance;
	
	public static int numOfAccounts;
	public static double totalMons;
	
	private String randCheckingNum() {
		return String.valueOf((long)Math.floor(Math.random() * 9000000000L) + 1000000000L);
	}
	
	public void getAccountBal(BankAccount bankAccount) {
		System.out.println(bankAccount.checkingBalance);
	}
	
	public void getSavingsBalance(BankAccount bankAccount) {
		System.out.println(bankAccount.savingsBalance);
	}
	
	public void depositMons(String accountType, double amount) {
		if (accountType == "checking") {
			this.checkingBalance += amount;
			BankAccount.totalMons += amount;
		} else if(accountType == "savings") {
			this.savingsBalance += amount;
			BankAccount.totalMons += amount;
		} else {
			System.out.println("Unrecognized input");
		}
	}
	
	public void withdrawMons(String accountType, double amountWithdraw) {
		if (accountType == "checking" && amountWithdraw > this.checkingBalance) {
			System.out.println("You don't have enough coins, bruv.");
		} else if (accountType == "checking" && amountWithdraw < this.checkingBalance) {
			checkingBalance -= amountWithdraw;
			System.out.println("Withdraw was successful.");
			System.out.println("Your remaining checking balance is: " + checkingBalance);
			BankAccount.totalMons -= amountWithdraw;
		} else {
			System.out.println("Unknown input");
		}
		if (accountType == "savings" && amountWithdraw > this.savingsBalance) {
			System.out.println("You don't have enough coins, burro.");
		} else if (accountType == "Savings" && amountWithdraw < savingsBalance) {
			System.out.println("Withdraw was successful.");
			System.out.println("Your remaining savings balance is: " + savingsBalance);
			BankAccount.totalMons -= amountWithdraw;
		} else {
			System.out.println("Unknown input");
		}
	}
	
	public static double getTotalMons() {
		return totalMons;
	}
	
	public BankAccount(String accountNum, double checkBalance, double saveBalance) {
		accountNum = randCheckingNum();
		accountNumber = accountNum;
		checkingBalance = checkBalance;
		savingsBalance = saveBalance;
		
		totalMons = checkBalance + saveBalance;
		numOfAccounts++;
	}
	
}

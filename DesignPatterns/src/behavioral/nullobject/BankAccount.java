package behavioral.nullobject;

public class BankAccount {
	
	private int balance;
	private Log log;
	
	public BankAccount(Log log) {
		this.log = log;
	}
	
	public void deposit(int amount) {
		balance += amount;
		log.log("Deposited : "+amount);
	}	

	@Override
	public String toString() {
		return "BankAccount [balance=" + balance + "]";
	}
	
	
}

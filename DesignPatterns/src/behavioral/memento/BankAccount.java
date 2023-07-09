package behavioral.memento;

public class BankAccount {
	
	private int balance;
	
	public BankAccount() {
	}
	
	public Memento deposit(int amount) {
		balance += amount;
		return new Memento(balance);
	}	

	public int restore(Memento m) {
		return this.balance = m.getBalance();
	}

	@Override
	public String toString() {
		return "BankAccount [balance=" + balance + "]";
	}
	
	
}

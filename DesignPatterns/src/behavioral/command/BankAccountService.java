package behavioral.command;

public class BankAccountService {
	
	private BankAccount account;
	
	public BankAccountService(BankAccount account) {
		super();
		this.account = account;
	}

	public void deposit(int amount) {
		account.setBalance(account.getBalance() + amount);
		System.out.println("Deposited "+ amount + " Balance "+account.getBalance());
	}
	
	public void withDrew(int amount) {
		if(account.getBalance() < amount ) {
			throw new LowBalanceException("Low Account Balance");
		}
		account.setBalance(account.getBalance() - amount);
		System.out.println("Withdrem "+ amount + " Balance "+account.getBalance());
	}

	
}

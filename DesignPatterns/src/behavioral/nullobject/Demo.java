package behavioral.nullobject;

public class Demo {
	public static void main(String[] args) {
		BankAccount account = new BankAccount(new ConsoleLog());
		
		account.deposit(100);
		
		BankAccount account1 = new BankAccount(new NullLog());
		
		account1.deposit(100);
		

	}
}

package behavioral.memento;

public class Demo {

	public static void main(String[] args) {
		BankAccount account = new BankAccount();
		Memento m1 = account.deposit(100);
		Memento m2 = account.deposit(50);
		Memento m3 = account.deposit(25);
		System.out.println(account.toString());
		
		account.restore(m2);
		System.out.println(account.toString());
	}
}

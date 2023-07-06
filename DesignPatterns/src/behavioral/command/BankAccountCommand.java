package behavioral.command;

public class BankAccountCommand implements ICommand{
	
	public enum ACTION {DEPOSIT, WITHDREW};
	
	private ACTION action;
	
	private BankAccountService service;
	
	private int balance;

	public BankAccountCommand(ACTION action, BankAccountService service, int balance) {
		super();
		this.action = action;
		this.service = service;
		this.balance = balance;
	}


	@Override
	public void doIt() {
		if(ACTION.DEPOSIT.equals(action)) {
			service.deposit(balance);
		}else if(ACTION.WITHDREW.equals(action)) {
			service.withDrew(balance);
		}
	}


	@Override
	public void undoIt() {
		if(ACTION.WITHDREW.equals(action)) {
			service.deposit(balance);
		}else if(ACTION.DEPOSIT.equals(action)) {
			service.withDrew(balance);
		}
	}	


}

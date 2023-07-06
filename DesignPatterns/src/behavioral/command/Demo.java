package behavioral.command;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Demo {
	public static void main(String[] args) {

		// injected
		BankAccount account = new BankAccount();
		account.setBalance(100);

		BankAccountService service = new BankAccountService(account);

		BankAccountCommand command1 = new BankAccountCommand(BankAccountCommand.ACTION.DEPOSIT, service, 500);
		BankAccountCommand command2 = new BankAccountCommand(BankAccountCommand.ACTION.WITHDREW, service, 100);
		BankAccountCommand command3 = new BankAccountCommand(BankAccountCommand.ACTION.WITHDREW, service, 200);
		BankAccountCommand command4 = new BankAccountCommand(BankAccountCommand.ACTION.DEPOSIT, service, 1000);
		BankAccountCommand command5 = new BankAccountCommand(BankAccountCommand.ACTION.WITHDREW, service, 600);
		BankAccountCommand command6 = new BankAccountCommand(BankAccountCommand.ACTION.WITHDREW, service, 500);
		
		
		List<ICommand> commandList = new LinkedList<>();
		commandList.add(command1);
		commandList.add(command2);
		commandList.add(command3);
		commandList.add(command4);
		commandList.add(command5);
		commandList.add(command6);

		CommandRecorder recoder = new CommandRecorder();

		for (ICommand command : commandList) {
			try {
				recoder.execute(command);
			} catch (Exception e) {
				recoder.rewind();
				break;
			}
		}
	}
}

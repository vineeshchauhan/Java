package behavioral.command;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class CommandRecorder {
	
	private List<ICommand> executedCommands = null;
	
	public CommandRecorder() {
		executedCommands = new LinkedList<>();
	}

	public void execute(ICommand command) {
		command.doIt();
		executedCommands.add(command);
	}

	public void rewind() {
		Collections.reverse(executedCommands);
		executedCommands.forEach( command -> command.undoIt());
	}
	
}

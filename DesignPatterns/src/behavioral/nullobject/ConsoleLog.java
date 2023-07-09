package behavioral.nullobject;

public class ConsoleLog implements Log {

	@Override
	public void log(String msg) {
		System.out.println(msg);
		
	}

	@Override
	public void warn(String msg) {
		System.out.println("WARNING : "+msg);
	}

}

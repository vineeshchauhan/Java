package structural.decorator.stringdecorator;

import java.util.stream.IntStream;

public class MagicString {
	
	private String value;

	public MagicString(String value) {
		this.value = value;
	}
	
	public char charAt(int index) {
		return value.charAt(index);
	}

	public int codePointAt(int index) {
		return value.codePointAt(index);
	}

	public IntStream chars() {
		return value.chars();
	}

}

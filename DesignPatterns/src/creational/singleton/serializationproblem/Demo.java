package creational.singleton.serializationproblem;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Demo {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {

		BasicSingletonSolution instance = BasicSingletonSolution.getBasicSingleton();
		instance.setValue(100);

		String fileName = "instance.txt";
		try (FileOutputStream outputStream = new FileOutputStream(fileName);
				ObjectOutputStream out = new ObjectOutputStream(outputStream);) {
			out.writeObject(instance);
		}
		BasicSingletonSolution instance_1 = null;
		try (FileInputStream outputStream = new FileInputStream(fileName);
				ObjectInputStream out = new ObjectInputStream(outputStream);) {
			instance_1 = (BasicSingletonSolution)out.readObject();
		}
		instance.setValue(200);
		System.out.println(instance == instance_1);
		System.out.println(instance.getValue());
		System.out.println(instance_1.getValue());
	}

}

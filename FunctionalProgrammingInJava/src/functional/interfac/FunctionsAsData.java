package functional.interfac;

public class FunctionsAsData {

	protected static class Person {
		String name;
		Integer age;

		public Person(String name, Integer age) {
			super();
			this.name = name;
			this.age = age;
		}

		@Override
		public String toString() {
			return "Person [name=" + name + ", age=" + age + "]";
		}

	}

	protected static class DataLoader {

		static INoArgFunction<Person> myFunction;

		public DataLoader() {
		};

		public DataLoader(boolean isDevelopment) {
			myFunction = (isDevelopment) ? this::loadFakePerson : this::loadRealPerson;
		}

		boolean isDevelopment;

		public Person getPerson(boolean isDevelopment) {
			if (isDevelopment) {
				return loadFakePerson();
			} else {
				return loadRealPerson();
			}
		}

		private Person loadRealPerson() {
			System.out.println("loading real person....");
			return new Person("Real Person", 30);
		}

		private Person loadFakePerson() {
			System.out.println("loading fake person....");
			return new Person("Fake Person", 130);
		}
	}

	public static void main(String[] args) {
		DataLoader load = new DataLoader();
		System.out.println(load.getPerson(true));

		DataLoader loadViaFunc = new DataLoader(true);
		System.out.println(loadViaFunc.myFunction.apply());

	}

}

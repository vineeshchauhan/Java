package creational.builder;

public class SmartHomeMain {

	public static void main(String[] args) {
		
		
		SmartHome smartHomewithCons = new SmartHome(null, 0, null, null, null, null, null, 0, 0, 0, 0, 0, 0, 0);
	
		SmartHomeWithBuilder smartHome = new SmartHomeWithBuilder
			    .SmartHomeBuilder()
			    .withName("RaspberrySmartHomeSystem")
			    .withSerialNumber(3627)
			    .withAddressName("Main Street")
			    .inCity("Kumanovo")
			    .inCountry("Macedonia")
			    .build();
	}

}

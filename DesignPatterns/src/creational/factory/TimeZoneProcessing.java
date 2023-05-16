package creational.factory;

import java.util.TimeZone;

import creational.factory.TimeZoneWithConstructor.ZONETYPE;

public class TimeZoneProcessing {

	public static void main(String[] args) {
		// TimeZoneWithFactoryClass timeZoneWithFactoryClass = new TimeZoneWithFactoryClass()
		
		TimeZone timeZoneTime = TimeZoneWithFactoryClass.Factory.createTimeZoneWithTime("GMT+05:30");
		
		TimeZone timeZoneRegion = TimeZoneWithFactoryClass.Factory.createTimeZoneWithRegion("America/Los_Angeles");
		
		// TimeZoneWithFactoryMethod timeZoneWithFactoryMethod = new TimeZoneWithFactoryMethod();
		
		TimeZone timeZoneTime1 = TimeZoneWithFactoryMethod.createTimeZoneWithTime("GMT+05:30");
		
		TimeZone timeZoneRegion1 = TimeZoneWithFactoryMethod.createTimeZoneWithRegion("America/Los_Angeles");
		
		// TimeZoneWithConstructor
		
		TimeZoneWithConstructor timeZoneWithConstructor = new TimeZoneWithConstructor();
		
		TimeZoneWithConstructor timeZoneWithTime = new TimeZoneWithConstructor("GMT+05:30",ZONETYPE.TIME);
		
		TimeZoneWithConstructor timeZoneWithRegion = new TimeZoneWithConstructor("America/Los_Angeles",ZONETYPE.REGION);
		
		
	}

}

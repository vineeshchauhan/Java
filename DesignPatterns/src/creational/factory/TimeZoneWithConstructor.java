package creational.factory;

import java.util.Date;
import java.util.TimeZone;

public class TimeZoneWithConstructor extends TimeZone {

	enum ZONETYPE {
		REGION, TIME
	};

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	String region;

	String time;

	TimeZone timeZone;

	public TimeZoneWithConstructor() {
		timeZone = TimeZone.getDefault();
	}

	// Below 2 constructors are not able to distinguish based on parameter name.
	public TimeZoneWithConstructor(String region) {
		timeZone = TimeZone.getTimeZone(region);
	}

	public TimeZoneWithConstructor(String time) {
		timeZone = TimeZone.getDefault();
		timeZone.getTimeZone(time);
	}

	// Solution of above 2 constructors.
	public TimeZoneWithConstructor(String type, ZONETYPE zoneType) {
		if (zoneType == ZONETYPE.REGION) {
			timeZone = TimeZone.getTimeZone(type);
		} else if (zoneType == ZONETYPE.TIME) {
			timeZone.getTimeZone(type);
		}
	}

	@Override
	public int getOffset(int era, int year, int month, int day, int dayOfWeek, int milliseconds) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setRawOffset(int offsetMillis) {
		// TODO Auto-generated method stub

	}

	@Override
	public int getRawOffset() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean useDaylightTime() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean inDaylightTime(Date date) {
		// TODO Auto-generated method stub
		return false;
	}
}

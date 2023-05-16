package creational.factory;

import java.util.Date;
import java.util.TimeZone;

public class TimeZoneWithFactoryClass extends TimeZone{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	String region;
	
	String time;
	
	TimeZone timeZone;
	
	private TimeZoneWithFactoryClass() {
		
	}
	
	static class Factory {
		public static TimeZone createDefaultTimeZone() {
			return TimeZone.getDefault();
		}
		
		public static TimeZone createTimeZoneWithRegion(String region) {
			return TimeZone.getTimeZone(region);
		}
	
		public static TimeZone createTimeZoneWithTime(String time) {
			return TimeZone.getTimeZone(time);
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

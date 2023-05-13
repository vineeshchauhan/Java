package creational.builder;

public class SmartHomeWithBuilder {
	private String name;
	private int serialNumber;
	private String addressName;
	private String addressNumber;
	private String city;
	private String country;
	private String postalCode;
	private int light1PortNum;
	private int light2PortNum;
	private int door1PortNum;
	private int door2PortNum;
	private int microwavePortNum;
	private int tvPortNum;
	private int waterHeaterPortNum;

	private SmartHomeWithBuilder() {
	}

	public static class SmartHomeBuilder {

		private String name;
		private int serialNumber;
		private String addressName;
		private String addressNumber;
		private String city;
		private String country;
		private String postalCode;
		private int light1PortNum;
		private int light2PortNum;
		private int door1PortNum;
		private int door2PortNum;
		private int microwavePortNum;
		private int tvPortNum;
		private int waterHeaterPortNum;

		public SmartHomeBuilder withName(String name) {
			this.name = name;
			return this;
		}

		public SmartHomeBuilder withSerialNumber(int serialNumber) {
			this.serialNumber = serialNumber;
			return this;
		}
		
		public SmartHomeBuilder withAddressName(String addressName) {
            this.addressName = addressName;
            return this;
        }

        public SmartHomeBuilder inCity(String city) {
            this.city = city;
            return this;
        }

        public SmartHomeBuilder inCountry(String country) {
            this.country = country;
            return this;
        }

		public SmartHomeWithBuilder build() {
			SmartHomeWithBuilder smartHome = new SmartHomeWithBuilder();
			smartHome.name = this.name;
			smartHome.serialNumber = this.serialNumber;
			smartHome.addressName = this.addressName;
			smartHome.city = this.city;
			smartHome.country = this.country;
			smartHome.postalCode = this.postalCode;
			smartHome.light1PortNum = this.light1PortNum;
			smartHome.light2PortNum = this.light2PortNum;
			smartHome.door1PortNum = this.door1PortNum;
			smartHome.door2PortNum = this.door2PortNum;
			smartHome.microwavePortNum = this.microwavePortNum;
			smartHome.tvPortNum = this.tvPortNum;
			smartHome.waterHeaterPortNum = this.waterHeaterPortNum;
			return smartHome;
		}
	}

}

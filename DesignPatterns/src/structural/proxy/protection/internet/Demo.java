package structural.proxy.protection.internet;

public class Demo {
	public static void main(String[] args) throws Exception {
		
		RealInternet realInternet = new RealInternet();
		realInternet.connectTo("eductional.com");
		realInternet.connectTo("youtube.com");
		
		
		RealInternet proxy = new ProxyRealInternet();
		proxy.connectTo("eductional.com");
		proxy.connectTo("youtube.com");
	}
}

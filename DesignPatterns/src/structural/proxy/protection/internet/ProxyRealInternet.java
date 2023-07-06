package structural.proxy.protection.internet;

public class ProxyRealInternet extends RealInternet{
	
	public void connectTo(String serverHost) {
		if("youtube.com".equalsIgnoreCase(serverHost)) {
			System.out.println("Access Denied");
		}else {
			System.out.println("Connecting to "+serverHost);
		}
		
	}

}

package structural.adapter;

public class Demo {

	public static void main(String[] args) {
		IInternetCall iCall = new InternetCall();
		iCall.makeVideoCall();
		
		INetworkCall iNetCall = new NetworkCall();
		iNetCall.makeCall("Audio");
		iNetCall.makeCall("Video");
		
		System.out.println("################# Adapter ##############");
		INetworkCall adapter = new NetworkToInternetCallAdapter();
		adapter.makeCall("Audio");
		
		adapter.makeCall("Video");
	}

}

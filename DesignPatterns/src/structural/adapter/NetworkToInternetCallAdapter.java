package structural.adapter;

public class NetworkToInternetCallAdapter implements INetworkCall {
	
	public NetworkToInternetCallAdapter() {
	}

	@Override
	public void makeCall(String type) {
		if("Audio".equals(type)) {
			new NetworkCall().makeCall(type);
		}else if("Video".equals(type)) {
			new InternetCall().makeVideoCall();
		}
	}

}

package structural.adapter;

public class NetworkCall implements INetworkCall{

	@Override
	public void makeCall(String type) {
		if("Audio".equals(type)) {
			System.out.println("Making a network call : "+type);
		} else {
			System.out.println("Unsupported type : "+type);
		}
		
	}

}

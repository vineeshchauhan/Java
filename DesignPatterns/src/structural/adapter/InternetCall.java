package structural.adapter;

public class InternetCall implements IInternetCall{

	@Override
	public void makeVideoCall() {
		System.out.println("Making a Video Call");		
	} 

}

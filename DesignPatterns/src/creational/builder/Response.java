package creational.builder;

public class Response {
	
	int responseCode;
	
	String message;

	public Response(int responseCode, String message) {
		this.responseCode = responseCode;
		this.message = message;
	}

	public int getResponseCode() {
		return responseCode;
	}

	public void setResponseCode(int responseCode) {
		this.responseCode = responseCode;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return " [responseCode=" + responseCode + ", message=" + message + "]";
	}

}

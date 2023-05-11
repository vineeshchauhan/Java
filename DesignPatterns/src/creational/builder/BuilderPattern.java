package creational.builder;

public class BuilderPattern {
	
	public static void main(String [] args) {
		StringBuilder sb = new StringBuilder();
		
		sb.append("The response is");
		
		sb.append(new Response(200,"Hello World!"));
		
		System.out.println(sb);// The StringBuilder object is created here. 
	}
}

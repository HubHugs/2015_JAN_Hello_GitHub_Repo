package hellopackage;

public class HelloWorld {
	
	private String name;

	public HelloWorld(String name) {
		this.name = name;
	}
	
	public void mrSpyriusMessage() {
		String message = "Why, hello there!";
		System.out.println(name + " says: " + message);
	}

	public static void main(String[] args) {
		HelloWorld hw = new HelloWorld("Mr. Spyrius");
		hw.mrSpyriusMessage();
	}

}

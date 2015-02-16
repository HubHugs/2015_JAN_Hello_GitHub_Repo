package hellopackage;

public class HelloWorld {
	
	private String name;

	public HelloWorld(String name) {
		this.name = name;
	}
	
	public void mrSpyriusMessage() {
		String message = "My new hello message!";
		System.out.println(name + " says: " + message);
	}

	public static void main(String[] args) {
		HelloWorld hw = new HelloWorld("Mr. Spyrius");
		hw.mrSpyriusMessage();
	}

}

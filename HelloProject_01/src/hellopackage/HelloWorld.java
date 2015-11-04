package hellopackage;

public class HelloWorld {
	
	private String name;

	public HelloWorld(String name) {
		this.name = name;
	}
	
	// I commented out the function below
	
//	public void mrSpyriusMessage() {
//		String message = "Big 'ol shucks, howdy!";
//		System.out.println(name + " says: " + message);
//	}
	
	// The following function has no use.
	public void myUselessFunction() {
		System.out.println("This function is useless!");
	}

	public static void main(String[] args) {
		HelloWorld hw = new HelloWorld("Mr. Spyrius");
//		hw.mrSpyriusMessage();
	}

}

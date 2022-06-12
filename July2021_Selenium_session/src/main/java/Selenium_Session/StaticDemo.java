package Selenium_Session;

public class StaticDemo {
	public StaticDemo() {
		System.out.println("Defaukt cont");
	}
static {
	System.out.println("Static block");
}
	public static void main(String[] args) {

	new StaticDemo();
		}
	}


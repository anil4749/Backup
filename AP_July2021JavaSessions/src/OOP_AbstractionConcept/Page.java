package OOP_AbstractionConcept;

public abstract class Page {
	
	//can not create the object of abstract class
	//abstract class can have 0 abstract methods-->0% abstraction
	//abstract class can have only abstract methods-->100% abstraction
	//abstract class can have abstract methods and non-abstract methods-->partial abstraction
	//0 to 100% abstract with help of abstract class
	
	
	public abstract void title();
	public abstract void header();
	
	public void timeout() { //This method can be overriden
		System.out.println("default Page time out is : "+ 20);
	}
	
	public final void logo() {//Final method can not be overriden
		System.out.println("Page ---Logo");
	}
	
	public static void getURL() {//
		System.out.println("https:..www.xyz.com");
	}
}

package OOP_AbstractionConcept;

public class LoginPage extends Page {

	@Override
	public void title() {
		System.out.println("LP--title");
	}

	@Override
	public void header() {
		System.out.println("LP--header");
		
	}
	
	public void doLogin() {
		System.out.println("LP--doLogin");
	}
	
	@Override
	public void timeout() {
		System.out.println("default Page time out is : "+ 20);
	}
	
}

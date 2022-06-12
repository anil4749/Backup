package OOP_AbstractionConcept;

public class TestPage {

	public static void main(String[] args) {
		
		LoginPage lp = new LoginPage();
		lp.title();
		lp.header();
		lp.timeout();
		lp.logo();
		Page.getURL();
		
		
		//Top Casting --OnLY ACCESS PARENT METHODS(Properties)
		Page p = new LoginPage();
		p.title();
		p.header();
 	}
	
		//Down Casting--Not Allowed
		//new Page();
	

}

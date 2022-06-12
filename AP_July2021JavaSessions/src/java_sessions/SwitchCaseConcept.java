package java_sessions;

public class SwitchCaseConcept {

	public static void main(String[] args) {

		//logic -> Launch Browser --ch/ff/safari
		
		String browser = "CHROME";
		
		switch (browser.toLowerCase()) {
		case "chrome":
			System.out.println("launch chrome");
			break;
		
		case "firefox":
			System.out.println("launch ff");
			break;
			
		case "safari":
			System.out.println("launch safari");
			break;

		default:
			System.out.println("plz pass the right browser....."+ browser);
			break;
		}
		
		//diff envs --> QA , Dev , Stage , Production
		
		String env = "qa";
		
		switch (env.toUpperCase()) {
		case "QA":
			System.out.println("url: "+ "http://www.qa.ac.com");
			System.out.println("qa:qa");
			break;

		case "DEV":
			System.out.println("url: "+ "http://www.qa.ac.com");
			System.out.println("dev:dev");
			break;

		case "STAGE":
			System.out.println("url: "+ "http://www.qa.ac.com");
			System.out.println("stg:stg");
			break;

		case "PROD":
			System.out.println("url: "+ "http://www.qa.ac.com");
			System.out.println("admin:admin");
			break;

		default:
			System.out.println("please pass the correct env name..."+ env);
			break;
		}
		
		int amount =80;
		
		switch (amount) {
		case 90:
			System.out.println("hi");
			break;
		
		case 80:
			System.out.println("hello");
			break;

		default:
			System.out.println("Bye");
			break;
		}
	}

}
